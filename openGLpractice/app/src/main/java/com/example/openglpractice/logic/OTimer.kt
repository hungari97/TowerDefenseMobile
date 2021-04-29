package com.example.openglpractice.logic

import java.lang.Exception
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.system.measureTimeMillis

object OTimer {
    lateinit var gameThickThread: Thread
    var waitTime: Long = 100
    private var threadRunning: Boolean = true
    var functionCallTime: Long = 0
    var count = 0
    private var subbscribers = CopyOnWriteArrayList<() -> Unit>()


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
                        try {
                        it()}catch (e :Exception){
                            e.printStackTrace()
                        }
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