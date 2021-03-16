package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003Jp\u0010\'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\nH\u00d6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001R\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013\u00a8\u0006/"}, d2 = {"Lcom/example/openglpractice/model/LevelData;", "", "fieldLayer", "", "Lcom/example/openglpractice/model/FieldData;", "AFeatureLayer", "Lcom/example/openglpractice/model/AFeatureData;", "characterLayer", "Lcom/example/openglpractice/model/CharacterData;", "waveNumber", "", "columnNumber", "coin", "buildLimit", "([Lcom/example/openglpractice/model/FieldData;[Lcom/example/openglpractice/model/AFeatureData;[Lcom/example/openglpractice/model/CharacterData;IIII)V", "getAFeatureLayer", "()[Lcom/example/openglpractice/model/AFeatureData;", "[Lcom/example/openglpractice/model/AFeatureData;", "getBuildLimit", "()I", "setBuildLimit", "(I)V", "getCharacterLayer", "()[Lcom/example/openglpractice/model/CharacterData;", "[Lcom/example/openglpractice/model/CharacterData;", "getCoin", "setCoin", "getColumnNumber", "getFieldLayer", "()[Lcom/example/openglpractice/model/FieldData;", "[Lcom/example/openglpractice/model/FieldData;", "getWaveNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "([Lcom/example/openglpractice/model/FieldData;[Lcom/example/openglpractice/model/AFeatureData;[Lcom/example/openglpractice/model/CharacterData;IIII)Lcom/example/openglpractice/model/LevelData;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class LevelData {
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.FieldData[] fieldLayer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.AFeatureData<?>[] AFeatureLayer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.CharacterData<?>[] characterLayer = null;
    private final int waveNumber = 0;
    private final int columnNumber = 0;
    private int coin;
    private int buildLimit;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.FieldData[] getFieldLayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.AFeatureData<?>[] getAFeatureLayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.CharacterData<?>[] getCharacterLayer() {
        return null;
    }
    
    public final int getWaveNumber() {
        return 0;
    }
    
    public final int getColumnNumber() {
        return 0;
    }
    
    public final int getCoin() {
        return 0;
    }
    
    public final void setCoin(int p0) {
    }
    
    public final int getBuildLimit() {
        return 0;
    }
    
    public final void setBuildLimit(int p0) {
    }
    
    public LevelData(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FieldData[] fieldLayer, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.AFeatureData<?>[] AFeatureLayer, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.CharacterData<?>[] characterLayer, int waveNumber, int columnNumber, int coin, int buildLimit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.FieldData[] component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.AFeatureData<?>[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.CharacterData<?>[] component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.LevelData copy(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FieldData[] fieldLayer, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.AFeatureData<?>[] AFeatureLayer, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.CharacterData<?>[] characterLayer, int waveNumber, int columnNumber, int coin, int buildLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}