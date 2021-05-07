package com.example.openglpractice.screen

interface GameScreen {
    fun LevelEnded()
    fun updateScreen()
    fun updateTrapLimits()
    fun updateBuildMode(value:Boolean)
}