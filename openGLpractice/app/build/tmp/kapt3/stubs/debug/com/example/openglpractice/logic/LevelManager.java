package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u000e\u00104\u001a\u0002012\u0006\u00102\u001a\u000203J\u0006\u00105\u001a\u000201J\u000e\u00105\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u001fJ\u0017\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u0001070\u0010\u00a2\u0006\u0002\u00108J\u0011\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0010\u00a2\u0006\u0002\u0010;J\u000e\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020>R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00100\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00100\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006?"}, d2 = {"Lcom/example/openglpractice/logic/LevelManager;", "", "()V", "collisionManager", "Lcom/example/openglpractice/logic/CollisionManager;", "getCollisionManager", "()Lcom/example/openglpractice/logic/CollisionManager;", "setCollisionManager", "(Lcom/example/openglpractice/logic/CollisionManager;)V", "data", "Lcom/example/openglpractice/model/LevelData;", "getData", "()Lcom/example/openglpractice/model/LevelData;", "setData", "(Lcom/example/openglpractice/model/LevelData;)V", "featureMatrix", "", "Lcom/example/openglpractice/logic/AFeature;", "getFeatureMatrix", "()[[Lcom/example/openglpractice/logic/AFeature;", "setFeatureMatrix", "([[Lcom/example/openglpractice/logic/AFeature;)V", "[[Lcom/example/openglpractice/logic/AFeature;", "fieldMatrix", "Lcom/example/openglpractice/logic/Field;", "getFieldMatrix", "()[[Lcom/example/openglpractice/logic/Field;", "setFieldMatrix", "([[Lcom/example/openglpractice/logic/Field;)V", "[[Lcom/example/openglpractice/logic/Field;", "hero", "Lcom/example/openglpractice/logic/Hero;", "getHero", "()Lcom/example/openglpractice/logic/Hero;", "setHero", "(Lcom/example/openglpractice/logic/Hero;)V", "selectedTrap", "Lcom/example/openglpractice/logic/FeatureFactory;", "getSelectedTrap", "()Lcom/example/openglpractice/logic/FeatureFactory;", "setSelectedTrap", "(Lcom/example/openglpractice/logic/FeatureFactory;)V", "selectedTraps", "", "getSelectedTraps", "()Ljava/util/Set;", "setSelectedTraps", "(Ljava/util/Set;)V", "addTrapToData", "", "position", "Lcom/example/openglpractice/model/Vector;", "buildTrap", "initialise", "initialiseFeatureLayer", "Lcom/example/openglpractice/model/AFeatureData;", "()[Lcom/example/openglpractice/model/AFeatureData;", "initialiseFieldLayer", "Lcom/example/openglpractice/model/FieldData;", "()[Lcom/example/openglpractice/model/FieldData;", "selectedFromThePalette", "selectedType", "", "app_debug"})
public final class LevelManager {
    public static com.example.openglpractice.model.LevelData data;
    public static com.example.openglpractice.logic.CollisionManager collisionManager;
    @org.jetbrains.annotations.Nullable()
    private static com.example.openglpractice.logic.FeatureFactory selectedTrap;
    public static com.example.openglpractice.logic.Hero hero;
    @org.jetbrains.annotations.NotNull()
    private static com.example.openglpractice.logic.AFeature<?>[][] featureMatrix = {};
    @org.jetbrains.annotations.NotNull()
    private static com.example.openglpractice.logic.Field[][] fieldMatrix = {};
    @org.jetbrains.annotations.NotNull()
    private static java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> selectedTraps;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.openglpractice.logic.LevelManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.LevelData getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.LevelData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.CollisionManager getCollisionManager() {
        return null;
    }
    
    public final void setCollisionManager(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.CollisionManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.logic.FeatureFactory getSelectedTrap() {
        return null;
    }
    
    public final void setSelectedTrap(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.FeatureFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Hero getHero() {
        return null;
    }
    
    public final void setHero(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Hero p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.AFeature<?>[][] getFeatureMatrix() {
        return null;
    }
    
    public final void setFeatureMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.AFeature<?>[][] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Field[][] getFieldMatrix() {
        return null;
    }
    
    public final void setFieldMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Field[][] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.example.openglpractice.logic.FeatureFactory> getSelectedTraps() {
        return null;
    }
    
    public final void setSelectedTraps(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> p0) {
    }
    
    public final void initialise(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Hero hero) {
    }
    
    public final void initialise() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.FieldData[] initialiseFieldLayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.AFeatureData<?>[] initialiseFeatureLayer() {
        return null;
    }
    
    public final void selectedFromThePalette(int selectedType) {
    }
    
    /**
     */
    public final void buildTrap(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position) {
    }
    
    private final void addTrapToData(com.example.openglpractice.model.Vector position) {
    }
    
    private LevelManager() {
        super();
    }
}