package com.example.openglpractice.screen

interface GameScreen {
    fun levelEnded()
    fun updateScreen()
    fun updateTrapLimits()
    fun updateBuildMode(value:Boolean)
}