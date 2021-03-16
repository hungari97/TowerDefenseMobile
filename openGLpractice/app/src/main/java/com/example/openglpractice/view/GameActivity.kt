package com.example.openglpractice.view

import android.app.ActivityManager
import android.content.Context
import android.content.pm.ConfigurationInfo
import android.graphics.PixelFormat
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.openglpractice.R
import com.example.openglpractice.injector
import com.example.openglpractice.logic.Trap
import com.example.openglpractice.model.Vector
import com.example.openglpractice.presenter.GamePresenter
import com.example.openglpractice.screen.GameScreen
import com.example.openglpractice.view.opengl.LessonFourRenderer
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class GameActivity : AppCompatActivity(), GameScreen {
    @Inject
    lateinit var gamePresenter: GamePresenter

    lateinit var ibSelectTraps: Array<ImageButton>
    var x: Float = 0.0f
    var y: Float = 0.0f
    lateinit var render: LessonFourRenderer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injector.inject(this)

        setContentView(R.layout.activity_main)
        gamePresenter.buildInitialise()
        render =
            LessonFourRenderer(
                this,
                gamePresenter
            )

        swGameView.setEGLConfigChooser(8, 8, 8, 8, 16, 0)
        swGameView.holder.setFormat(PixelFormat.RGBA_8888)
        swGameView.setZOrderOnTop(true)

        // Check if the system supports OpenGL ES 2.0.
        val activityManager: ActivityManager =
            getSystemService(Context.ACTIVITY_SERVICE) as (ActivityManager)
        val configurationInfo: ConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        val supportsEs2: Boolean = configurationInfo.reqGlEsVersion >= 0x20000;

        if (supportsEs2) {   // Request an OpenGL ES 2.0 compatible context.
            swGameView.setEGLContextClientVersion(2);
            // Set the renderer to our demo renderer, defined below.
            swGameView.setRenderer(render)
        } else {
            // This is where you could create an OpenGL ES 1.x compatible
            // renderer if you wanted to support both ES 1 and ES 2.
            return;
        }


        swGameView.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, m: MotionEvent): Boolean {
                if (m.getAction() == MotionEvent.ACTION_DOWN) {
                    // Perform tasks here
                    x = m.x * 8 / swGameView.height
                    y = 8 - (m.y * 8 / swGameView.height)
                    println("x:${x} y:${y}")

                    if (y >= 8.0f) {
                        y = 7.9f
                    }
                    if (x >= 14.0f) {
                        x = 13.9f
                    }
                    gamePresenter.buildTouch(
                        Vector(
                            x.toDouble(),
                            y.toDouble()
                        )
                    )
                    render.featureUpdate()
                }
                return true
            }
        })

        swGameView.setZOrderMediaOverlay(true)


        ibSelectTraps = arrayOf(
            ibTrapSelect1,
            ibTrapSelect2,
            ibTrapSelect3,
            ibTrapSelect4,
            ibTrapSelect5,
            ibTrapSelect6
        )
        ibSelectTraps.forEach { button -> button.setOnClickListener { trapSelectOnClick(button) } }

        ibSelectTraps[0].setImageResource(gamePresenter.getSelectedTrapList()[0])

        /*findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }*/

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
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

    fun trapSelectOnClick(v: ImageButton) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (v.background.constantState == getDrawable(R.drawable.selected_traplist_item)!!.constantState) {
                v.setBackgroundResource(R.drawable.not_selected_traplist_item)
            } else {
                resetTrapBackgound()
                v.setBackgroundResource(R.drawable.selected_traplist_item)
                gamePresenter.trapHasBeenSelected(ibSelectTraps.indexOf(v))
            }
        } else {
            TODO("VERSION.SDK_INT < LOLLIPOP")
        }

    }

    private fun resetTrapBackgound() {
        ibSelectTraps.forEach {
            it.setBackgroundResource(R.drawable.not_selected_traplist_item)
        }
    }

    override fun selectTrap(index: Int) {
        TODO("Not yet implemented")
    }

    override fun drawTrap(trap: Trap) {
        TODO("Not yet implemented")
    }

    override fun initialise() {
        TODO("Not yet implemented")
    }


}