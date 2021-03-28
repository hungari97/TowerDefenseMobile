package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/example/openglpractice/logic/Timer;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "functionCallTime", "", "getFunctionCallTime", "()J", "setFunctionCallTime", "(J)V", "gameThickThread", "Ljava/lang/Thread;", "getGameThickThread", "()Ljava/lang/Thread;", "setGameThickThread", "(Ljava/lang/Thread;)V", "subbscribers", "", "Lkotlin/Function0;", "", "getSubbscribers", "()Ljava/util/List;", "setSubbscribers", "(Ljava/util/List;)V", "threadRunning", "", "waitTime", "getWaitTime", "setWaitTime", "killTimer", "startThread", "updateScreen", "app_debug"})
public final class Timer {
    public static java.lang.Thread gameThickThread;
    private static long waitTime = 100L;
    private static boolean threadRunning = true;
    private static long functionCallTime = 0L;
    private static int count = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> subbscribers;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.openglpractice.logic.Timer INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Thread getGameThickThread() {
        return null;
    }
    
    public final void setGameThickThread(@org.jetbrains.annotations.NotNull()
    java.lang.Thread p0) {
    }
    
    public final long getWaitTime() {
        return 0L;
    }
    
    public final void setWaitTime(long p0) {
    }
    
    public final long getFunctionCallTime() {
        return 0L;
    }
    
    public final void setFunctionCallTime(long p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> getSubbscribers() {
        return null;
    }
    
    public final void setSubbscribers(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> p0) {
    }
    
    public final void startThread() {
    }
    
    public final void updateScreen() {
    }
    
    public final void killTimer() {
    }
    
    private Timer() {
        super();
    }
}