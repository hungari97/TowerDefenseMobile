package com.example.openglpractice.view

import android.annotation.SuppressLint
import android.app.ActivityManager
import android.content.Context
import android.content.pm.ConfigurationInfo
import android.graphics.PixelFormat
import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.openglpractice.R
import com.example.openglpractice.injector
import com.example.openglpractice.logic.OTimer
import com.example.openglpractice.utility.Vector
import com.example.openglpractice.presenter.GamePresenter
import com.example.openglpractice.screen.GameScreen
import com.example.openglpractice.view.opengl.Renderer
import kotlinx.android.synthetic.main.activity_main.*
import java.io.InputStreamReader
import javax.inject.Inject

class GameActivity : AppCompatActivity(), GameScreen {

    @Inject
    lateinit var gamePresenter: GamePresenter
    private lateinit var ibSelectTraps: Array<ImageButton>
    private lateinit var ibSelectArrow: Array<ImageButton>
    /*private var x: Float = 0.0f
    private var y: Float = 0.0f*/
    private lateinit var render: Renderer
    private var buildMode: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_main)

        gamePresenter.buildInitialise(fieldLayer())
        render =
            Renderer(
                this,
                gamePresenter
            )

        swGameView.setEGLConfigChooser(8, 8, 8, 8, 16, 0)
        swGameView.holder.setFormat(PixelFormat.RGBA_8888)
        swGameView.setZOrderOnTop(true)

        // Check if the system supports OpenGL ES 2.0.
        val activityManager: ActivityManager =
            getSystemService(Context.ACTIVITY_SERVICE) as (ActivityManager)
        val configurationInfo: ConfigurationInfo = activityManager.deviceConfigurationInfo
        val supportsEs2: Boolean = configurationInfo.reqGlEsVersion >= 0x20000;

        if (supportsEs2) {   // Request an OpenGL ES 2.0 compatible context.
            swGameView.setEGLContextClientVersion(2)
            // Set the renderer to our demo renderer, defined below.
            swGameView.setRenderer(render)
        } else {
            // This is where you could create an OpenGL ES 1.x compatible
            // renderer if you wanted to support both ES 1 and ES 2.
            return;
        }

        swGameView.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, m: MotionEvent): Boolean {
                if (m.action == MotionEvent.ACTION_DOWN) {
                    var x = m.x * 8 / swGameView.height
                    var y = 8 - (m.y * 8 / swGameView.height)
                    if (y >= 8.0f) {
                        y = 7.9f
                    }
                    if (x >= 14.0f) {
                        x = 13.9f
                    }
                    if (buildMode)
                        gamePresenter.buildTouch(
                            Vector(x.toInt(),y.toInt())
                        ) else
                        gamePresenter.gameHeroGoalPosition(Vector(x.toInt(),y.toInt()))
                    render.featureUpdate()
                }
                return true
            }
        })

        swGameView.setZOrderMediaOverlay(true)

        fbPlayStart.setOnClickListener {
            if (buildMode) {
                gamePresenter.buildStartWave()
                buildMode = false
                llTraps.visibility = View.GONE
                llRotationArrow.visibility = View.GONE
            } else {
                gamePresenter.gameHeroAttack()
            }
        }

        ibSelectTraps = arrayOf(
            ibTrapSelect1,
            ibTrapSelect2,
            ibTrapSelect3
        )
        ibSelectTraps.forEachIndexed { _, button ->
            button.setOnClickListener { trapSelectOnClick(button) }
        }

        ibSelectTraps[0].setImageResource(gamePresenter.logicGetSelectedTrapList()[0])
        ibSelectTraps[1].setImageResource(gamePresenter.logicGetSelectedTrapList()[1])

        ibSelectArrow = arrayOf(ibArrowLeft, ibArrowUp, ibArrowRight, ibArrowDown)
        ibSelectArrow.forEach { button ->
            button.setOnClickListener { arrowSelectOnClick(button) }
        }

        llRotationArrow.visibility = View.INVISIBLE

        OTimer.subscribe(::updateScreen)

    }

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }*/

    private fun fieldLayer(): Array<Array<Int>> {
        val fieldTypeList = mutableListOf<Array<Int>>()
        val reader = InputStreamReader(resources.openRawResource(R.raw.level_2)).buffered()
        reader.forEachLine { line ->
            fieldTypeList.add(line.split(" ".toRegex()).map { splited -> splited.toInt() }
                .toTypedArray())
        }

        return fieldTypeList.toTypedArray()
    }

    override fun onResume() {
        super.onResume()
        gamePresenter.attachScreen(this)
        swGameView.onResume()
    }

    override fun onPause() {
        super.onPause()
        gamePresenter.detachScreen()
        swGameView.onPause()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun trapSelectOnClick(v: ImageButton) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (v.background.constantState == getDrawable(R.drawable.selected_traplist_item)!!.constantState) {
                v.setBackgroundResource(R.drawable.not_selected_traplist_item)
                llRotationArrow.visibility = View.GONE
                gamePresenter.buildTrapHasBeenSelected(ibSelectTraps.indexOf(v))
            } else {
                ibSelectTraps.forEach {
                    it.setBackgroundResource(R.drawable.not_selected_traplist_item)
                }
                v.setBackgroundResource(R.drawable.selected_traplist_item)
                gamePresenter.buildTrapHasBeenSelected(ibSelectTraps.indexOf(v))
                llRotationArrow.visibility = View.VISIBLE
            }

        } else {
            TODO("VERSION.SDK_INT < LOLLIPOP")
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun arrowSelectOnClick(v: ImageButton) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (v.background.constantState == getDrawable(R.drawable.selected_arrow_background)!!.constantState) {
                gamePresenter.buildArrowSelected(ibSelectArrow.indexOf(v))
            } else {
                ibSelectArrow.forEach { it.background = getDrawable(R.color.invisible) }
                v.background = getDrawable(R.drawable.selected_arrow_background)
                gamePresenter.buildArrowSelected(ibSelectArrow.indexOf(v))
            }
            llRotationArrow.visibility = View.INVISIBLE

        } else {
            TODO("VERSION.SDK_INT < LOLLIPOP")
        }
    }

    override fun updateScreen() {
        render.featureUpdate()
        render.characterUpdate()
    }

}