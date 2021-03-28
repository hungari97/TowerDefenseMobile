package com.example.openglpractice.view.opengl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\bH\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJ\u00a8\u0006K"}, d2 = {"Lcom/example/openglpractice/view/opengl/TileType;", "", "textureIndexes", "", "(Ljava/lang/String;I[F)V", "getTextureIndexes", "()[F", "giveOneRandomItem", "FLOOR_LURD", "FLOOR_XURD", "FLOOR_LXRD", "FLOOR_LUXD", "FLOOR_LURX", "FLOOR_XXRD", "FLOOR_XUXD", "FLOOR_XURX", "FLOOR_LXXD", "FLOOR_LXRX", "FLOOR_LUXX", "FLOOR_LXXX", "FLOOR_XUXX", "FLOOR_XXRX", "FLOOR_XXXD", "FLOOR_XXXX", "WALL_LURD", "WALL_XURD", "WALL_LXRD", "WALL_LUXD", "WALL_LURX", "WALL_XXRD", "WALL_XUXD", "WALL_XURX", "WALL_LXXD", "WALL_LXRX", "WALL_LUXX", "WALL_LXXX", "WALL_XUXX", "WALL_XXRX", "WALL_XXXD", "WALL_XXXX", "PIT_LURD", "PIT_XURD", "PIT_LXRD", "PIT_LUXD", "PIT_LURX", "PIT_XXRD", "PIT_XUXD", "PIT_XURX", "PIT_LXXD", "PIT_LXRX", "PIT_LUXX", "PIT_LXXX", "PIT_XUXX", "PIT_XXRX", "PIT_XXXD", "PIT_XXXX", "WATER_LURD", "WATER_XURD", "WATER_LXRD", "WATER_LUXD", "WATER_LURX", "WATER_XXRD", "WATER_XUXD", "WATER_XURX", "WATER_LXXD", "WATER_LXRX", "WATER_LUXX", "WATER_LXXX", "WATER_XUXX", "WATER_XXRX", "WATER_XXXD", "WATER_XXXX", "CHARACTER_NOTHING", "TRAP", "TRAP_NOTHING", "app_debug"})
public enum TileType {
    /*public static final*/ FLOOR_LURD /* = new FLOOR_LURD(null) */,
    /*public static final*/ FLOOR_XURD /* = new FLOOR_XURD(null) */,
    /*public static final*/ FLOOR_LXRD /* = new FLOOR_LXRD(null) */,
    /*public static final*/ FLOOR_LUXD /* = new FLOOR_LUXD(null) */,
    /*public static final*/ FLOOR_LURX /* = new FLOOR_LURX(null) */,
    /*public static final*/ FLOOR_XXRD /* = new FLOOR_XXRD(null) */,
    /*public static final*/ FLOOR_XUXD /* = new FLOOR_XUXD(null) */,
    /*public static final*/ FLOOR_XURX /* = new FLOOR_XURX(null) */,
    /*public static final*/ FLOOR_LXXD /* = new FLOOR_LXXD(null) */,
    /*public static final*/ FLOOR_LXRX /* = new FLOOR_LXRX(null) */,
    /*public static final*/ FLOOR_LUXX /* = new FLOOR_LUXX(null) */,
    /*public static final*/ FLOOR_LXXX /* = new FLOOR_LXXX(null) */,
    /*public static final*/ FLOOR_XUXX /* = new FLOOR_XUXX(null) */,
    /*public static final*/ FLOOR_XXRX /* = new FLOOR_XXRX(null) */,
    /*public static final*/ FLOOR_XXXD /* = new FLOOR_XXXD(null) */,
    /*public static final*/ FLOOR_XXXX /* = new FLOOR_XXXX(null) */,
    /*public static final*/ WALL_LURD /* = new WALL_LURD(null) */,
    /*public static final*/ WALL_XURD /* = new WALL_XURD(null) */,
    /*public static final*/ WALL_LXRD /* = new WALL_LXRD(null) */,
    /*public static final*/ WALL_LUXD /* = new WALL_LUXD(null) */,
    /*public static final*/ WALL_LURX /* = new WALL_LURX(null) */,
    /*public static final*/ WALL_XXRD /* = new WALL_XXRD(null) */,
    /*public static final*/ WALL_XUXD /* = new WALL_XUXD(null) */,
    /*public static final*/ WALL_XURX /* = new WALL_XURX(null) */,
    /*public static final*/ WALL_LXXD /* = new WALL_LXXD(null) */,
    /*public static final*/ WALL_LXRX /* = new WALL_LXRX(null) */,
    /*public static final*/ WALL_LUXX /* = new WALL_LUXX(null) */,
    /*public static final*/ WALL_LXXX /* = new WALL_LXXX(null) */,
    /*public static final*/ WALL_XUXX /* = new WALL_XUXX(null) */,
    /*public static final*/ WALL_XXRX /* = new WALL_XXRX(null) */,
    /*public static final*/ WALL_XXXD /* = new WALL_XXXD(null) */,
    /*public static final*/ WALL_XXXX /* = new WALL_XXXX(null) */,
    /*public static final*/ PIT_LURD /* = new PIT_LURD(null) */,
    /*public static final*/ PIT_XURD /* = new PIT_XURD(null) */,
    /*public static final*/ PIT_LXRD /* = new PIT_LXRD(null) */,
    /*public static final*/ PIT_LUXD /* = new PIT_LUXD(null) */,
    /*public static final*/ PIT_LURX /* = new PIT_LURX(null) */,
    /*public static final*/ PIT_XXRD /* = new PIT_XXRD(null) */,
    /*public static final*/ PIT_XUXD /* = new PIT_XUXD(null) */,
    /*public static final*/ PIT_XURX /* = new PIT_XURX(null) */,
    /*public static final*/ PIT_LXXD /* = new PIT_LXXD(null) */,
    /*public static final*/ PIT_LXRX /* = new PIT_LXRX(null) */,
    /*public static final*/ PIT_LUXX /* = new PIT_LUXX(null) */,
    /*public static final*/ PIT_LXXX /* = new PIT_LXXX(null) */,
    /*public static final*/ PIT_XUXX /* = new PIT_XUXX(null) */,
    /*public static final*/ PIT_XXRX /* = new PIT_XXRX(null) */,
    /*public static final*/ PIT_XXXD /* = new PIT_XXXD(null) */,
    /*public static final*/ PIT_XXXX /* = new PIT_XXXX(null) */,
    /*public static final*/ WATER_LURD /* = new WATER_LURD(null) */,
    /*public static final*/ WATER_XURD /* = new WATER_XURD(null) */,
    /*public static final*/ WATER_LXRD /* = new WATER_LXRD(null) */,
    /*public static final*/ WATER_LUXD /* = new WATER_LUXD(null) */,
    /*public static final*/ WATER_LURX /* = new WATER_LURX(null) */,
    /*public static final*/ WATER_XXRD /* = new WATER_XXRD(null) */,
    /*public static final*/ WATER_XUXD /* = new WATER_XUXD(null) */,
    /*public static final*/ WATER_XURX /* = new WATER_XURX(null) */,
    /*public static final*/ WATER_LXXD /* = new WATER_LXXD(null) */,
    /*public static final*/ WATER_LXRX /* = new WATER_LXRX(null) */,
    /*public static final*/ WATER_LUXX /* = new WATER_LUXX(null) */,
    /*public static final*/ WATER_LXXX /* = new WATER_LXXX(null) */,
    /*public static final*/ WATER_XUXX /* = new WATER_XUXX(null) */,
    /*public static final*/ WATER_XXRX /* = new WATER_XXRX(null) */,
    /*public static final*/ WATER_XXXD /* = new WATER_XXXD(null) */,
    /*public static final*/ WATER_XXXX /* = new WATER_XXXX(null) */,
    /*public static final*/ CHARACTER_NOTHING /* = new CHARACTER_NOTHING(null) */,
    /*public static final*/ TRAP /* = new TRAP(null) */,
    /*public static final*/ TRAP_NOTHING /* = new TRAP_NOTHING(null) */;
    @org.jetbrains.annotations.NotNull()
    private final float[] textureIndexes = null;
    
    @org.jetbrains.annotations.NotNull()
    public final float[] giveOneRandomItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getTextureIndexes() {
        return null;
    }
    
    TileType(float[] textureIndexes) {
    }
}