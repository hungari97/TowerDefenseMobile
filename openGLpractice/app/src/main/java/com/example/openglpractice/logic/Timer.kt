package com.example.openglpractice.logic

import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

object Timer {
    lateinit var gameThickThread: Thread
    var waitTime: Long = 250
    private var threadRunning: Boolean = true
    var functionCallTime: Long = 0
var count=0
    var subbscribers: MutableList<() -> Unit> = mutableListOf()

    fun startThread() {
        threadRunning=true
        count=0
        gameThickThread = Thread {
            while (threadRunning) {
                if (waitTime - functionCallTime > 0)
                    Thread.sleep(waitTime - functionCallTime)
                functionCallTime = measureTimeMillis {
                    println("${count++} size ${subbscribers.size}")
                    subbscribers.forEach {
                        it()
                    }
                }
            }
        }
        gameThickThread.start()
    }

    fun updateScreen() {

    }

    fun killTimer() {
        threadRunning = false
        subbscribers.clear()
    }

}