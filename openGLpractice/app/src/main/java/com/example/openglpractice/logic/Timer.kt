package com.example.openglpractice.logic

import java.util.*
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.system.measureTimeMillis

object Timer {
    lateinit var gameThickThread: Thread
    var waitTime: Long = 100
    private var threadRunning: Boolean = true
    var functionCallTime: Long = 0
    var count = 0
    private var subbscribers/*: MutableList<> */ = CopyOnWriteArrayList<() -> Unit>()


    fun startThread() {
        threadRunning = true
        count = 0

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

    fun subscribe(func: () -> Unit) {
            subbscribers.plusAssign(func)
    }

    fun unSubscribe(func: () -> Unit) {
            subbscribers.remove(func)
    }

    fun killTimer() {
        threadRunning = false
        subbscribers.clear()
    }

}