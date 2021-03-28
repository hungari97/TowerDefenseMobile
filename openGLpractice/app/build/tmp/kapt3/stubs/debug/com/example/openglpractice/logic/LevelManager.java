package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010F\u001a\u00020G2\n\u0010H\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0002J\u0010\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020KH\u0002J\u000e\u0010L\u001a\u00020G2\u0006\u0010J\u001a\u00020KJ\u000e\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020;J\u0006\u0010O\u001a\u00020GJ\u000e\u0010O\u001a\u00020G2\u0006\u0010,\u001a\u00020-J\u0017\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010Q0\u000b\u00a2\u0006\u0002\u0010RJ\u0017\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010T0\u000b\u00a2\u0006\u0002\u0010UJ\u0011\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u000b\u00a2\u0006\u0002\u0010XJ\u0010\u0010Y\u001a\u00020\u00042\u0006\u0010J\u001a\u00020KH\u0002J\u000e\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020KJ\u000e\u0010\\\u001a\u00020G2\u0006\u0010]\u001a\u00020^R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u000b0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001f0\u000b0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000b0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u00a8\u0006_"}, d2 = {"Lcom/example/openglpractice/logic/LevelManager;", "", "()V", "buildMode", "", "getBuildMode", "()Z", "setBuildMode", "(Z)V", "buildPhase", "characterMatrix", "", "Lcom/example/openglpractice/logic/Character;", "getCharacterMatrix", "()[[Lcom/example/openglpractice/logic/Character;", "setCharacterMatrix", "([[Lcom/example/openglpractice/logic/Character;)V", "[[Lcom/example/openglpractice/logic/Character;", "collisionManager", "Lcom/example/openglpractice/logic/CollisionManager;", "getCollisionManager", "()Lcom/example/openglpractice/logic/CollisionManager;", "setCollisionManager", "(Lcom/example/openglpractice/logic/CollisionManager;)V", "data", "Lcom/example/openglpractice/model/LevelData;", "getData", "()Lcom/example/openglpractice/model/LevelData;", "setData", "(Lcom/example/openglpractice/model/LevelData;)V", "featureMatrix", "Lcom/example/openglpractice/logic/AFeature;", "getFeatureMatrix", "()[[Lcom/example/openglpractice/logic/AFeature;", "setFeatureMatrix", "([[Lcom/example/openglpractice/logic/AFeature;)V", "[[Lcom/example/openglpractice/logic/AFeature;", "fieldMatrix", "Lcom/example/openglpractice/logic/Field;", "getFieldMatrix", "()[[Lcom/example/openglpractice/logic/Field;", "setFieldMatrix", "([[Lcom/example/openglpractice/logic/Field;)V", "[[Lcom/example/openglpractice/logic/Field;", "hero", "Lcom/example/openglpractice/logic/Hero;", "getHero", "()Lcom/example/openglpractice/logic/Hero;", "setHero", "(Lcom/example/openglpractice/logic/Hero;)V", "idGen", "", "selectedRotation", "", "getSelectedRotation", "()B", "setSelectedRotation", "(B)V", "selectedTrap", "Lcom/example/openglpractice/logic/FeatureFactory;", "getSelectedTrap", "()Lcom/example/openglpractice/logic/FeatureFactory;", "setSelectedTrap", "(Lcom/example/openglpractice/logic/FeatureFactory;)V", "selectedTraps", "", "getSelectedTraps", "()Ljava/util/Set;", "setSelectedTraps", "(Ljava/util/Set;)V", "activateAnimation", "", "feature", "addTrapToData", "position", "Lcom/example/openglpractice/model/Vector;", "buildTrap", "idGenerate", "type", "initialise", "initialiseCharacterLayer", "Lcom/example/openglpractice/model/CharacterData;", "()[Lcom/example/openglpractice/model/CharacterData;", "initialiseFeatureLayer", "Lcom/example/openglpractice/model/AFeatureData;", "()[Lcom/example/openglpractice/model/AFeatureData;", "initialiseFieldLayer", "Lcom/example/openglpractice/model/FieldData;", "()[Lcom/example/openglpractice/model/FieldData;", "okToPutDown", "positonToHero", "to", "selectedFromThePalette", "selectedType", "", "app_debug"})
public final class LevelManager {
    private static boolean buildMode = true;
    private static byte selectedRotation = (byte)0;
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
    private static com.example.openglpractice.logic.Character<?>[][] characterMatrix = {};
    @org.jetbrains.annotations.NotNull()
    private static java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> selectedTraps;
    private static long idGen = 0L;
    private static boolean buildPhase = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.openglpractice.logic.LevelManager INSTANCE = null;
    
    public final boolean getBuildMode() {
        return false;
    }
    
    public final void setBuildMode(boolean p0) {
    }
    
    public final byte getSelectedRotation() {
        return 0;
    }
    
    public final void setSelectedRotation(byte p0) {
    }
    
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
    public final com.example.openglpractice.logic.Character<?>[][] getCharacterMatrix() {
        return null;
    }
    
    public final void setCharacterMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Character<?>[][] p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.CharacterData<?>[] initialiseCharacterLayer() {
        return null;
    }
    
    public final void selectedFromThePalette(int selectedType) {
    }
    
    public final long idGenerate(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.FeatureFactory type) {
        return 0L;
    }
    
    public final void positonToHero(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector to) {
    }
    
    /**
     */
    public final void buildTrap(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position) {
    }
    
    private final boolean okToPutDown(com.example.openglpractice.model.Vector position) {
        return false;
    }
    
    private final void activateAnimation(com.example.openglpractice.logic.AFeature<?> feature) {
    }
    
    private final void addTrapToData(com.example.openglpractice.model.Vector position) {
    }
    
    private LevelManager() {
        super();
    }
}