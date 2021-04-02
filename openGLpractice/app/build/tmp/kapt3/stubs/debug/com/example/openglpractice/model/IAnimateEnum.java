package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/model/IAnimateEnum;", "", "textureArray", "", "", "getTextureArray", "()[[F", "calculateAnimationArray", "type", "", "rest", "", "(IZ)[[F", "app_debug"})
public abstract interface IAnimateEnum {
    
    @org.jetbrains.annotations.NotNull()
    public abstract float[][] getTextureArray();
    
    @org.jetbrains.annotations.NotNull()
    public abstract float[][] calculateAnimationArray(int type, boolean rest);
}