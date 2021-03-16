package com.example.openglpractice

import android.app.Application
import com.example.openglpractice.view.UIModule

class TowerDefApplication :Application(){
    lateinit var injector:TowerDefApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injector=DaggerTowerDefApplicationComponent.builder().uIModule(UIModule(this)).build()
    }


}