package com.example.openglpractice

import android.app.Activity

val Activity.injector: TowerDefApplicationComponent
    get() {
        return (this.applicationContext as TowerDefApplication).injector
    }