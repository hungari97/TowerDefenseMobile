package com.example.openglpractice.screen

import com.example.openglpractice.logic.AFeature
import com.example.openglpractice.logic.Trap

interface GameScreen {

    fun selectTrap(index:Int)

    fun drawTrap(trap: Trap)

    fun initialise()

}