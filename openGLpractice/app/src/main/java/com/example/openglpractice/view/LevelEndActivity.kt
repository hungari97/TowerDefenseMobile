package com.example.openglpractice.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.openglpractice.R
import com.example.openglpractice.injector
import com.example.openglpractice.presenter.LevelEndPresenter
import com.example.openglpractice.screen.LevelEndScreen
import kotlinx.android.synthetic.main.activity_level_end.*
import javax.inject.Inject

class LevelEndActivity : AppCompatActivity(), LevelEndScreen {
    @Inject
    lateinit var levelEndPresenter: LevelEndPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_level_end)

    }

    override fun onResume() {
        super.onResume()
        levelEndPresenter.attachScreen(this)
    }

    override fun onPause() {
        super.onPause()
        levelEndPresenter.detachScreen()
    }
}