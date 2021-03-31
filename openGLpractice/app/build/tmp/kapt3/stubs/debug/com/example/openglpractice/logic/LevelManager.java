package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010K\u001a\u00020L2\n\u0010M\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002J\u0010\u0010N\u001a\u00020L2\u0006\u0010O\u001a\u00020PH\u0002J\u000e\u0010Q\u001a\u00020L2\u0006\u0010O\u001a\u00020PJ\u0010\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u00020;H\u0002J\u0006\u0010T\u001a\u00020LJ\u000e\u0010T\u001a\u00020L2\u0006\u0010%\u001a\u00020&J\u0019\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010V0\u0017H\u0002\u00a2\u0006\u0002\u0010WJ\u0019\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010Y0\u0017H\u0002\u00a2\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u0017H\u0002\u00a2\u0006\u0002\u0010]J\u0010\u0010^\u001a\u00020\u00042\u0006\u0010O\u001a\u00020PH\u0002J\u000e\u0010_\u001a\u00020L2\u0006\u0010`\u001a\u00020PJ\u000e\u0010a\u001a\u00020L2\u0006\u0010b\u001a\u00020cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00180\u00170\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00170\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010.0\u00170\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010.0\u00170\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bI\u00100\"\u0004\bJ\u00102\u00a8\u0006d"}, d2 = {"Lcom/example/openglpractice/logic/LevelManager;", "", "()V", "buildMode", "", "getBuildMode", "()Z", "setBuildMode", "(Z)V", "buildPhase", "collisionManager", "Lcom/example/openglpractice/logic/CollisionManager;", "getCollisionManager", "()Lcom/example/openglpractice/logic/CollisionManager;", "setCollisionManager", "(Lcom/example/openglpractice/logic/CollisionManager;)V", "data", "Lcom/example/openglpractice/model/LevelData;", "getData", "()Lcom/example/openglpractice/model/LevelData;", "setData", "(Lcom/example/openglpractice/model/LevelData;)V", "featureMatrix", "", "Lcom/example/openglpractice/logic/AFeature;", "getFeatureMatrix", "()[[Lcom/example/openglpractice/logic/AFeature;", "setFeatureMatrix", "([[Lcom/example/openglpractice/logic/AFeature;)V", "[[Lcom/example/openglpractice/logic/AFeature;", "fieldMatrix", "Lcom/example/openglpractice/logic/Field;", "getFieldMatrix", "()[[Lcom/example/openglpractice/logic/Field;", "setFieldMatrix", "([[Lcom/example/openglpractice/logic/Field;)V", "[[Lcom/example/openglpractice/logic/Field;", "hero", "Lcom/example/openglpractice/logic/Hero;", "getHero", "()Lcom/example/openglpractice/logic/Hero;", "setHero", "(Lcom/example/openglpractice/logic/Hero;)V", "idGen", "", "lowCharacterMatrix", "Lcom/example/openglpractice/logic/Character;", "getLowCharacterMatrix", "()[[Lcom/example/openglpractice/logic/Character;", "setLowCharacterMatrix", "([[Lcom/example/openglpractice/logic/Character;)V", "[[Lcom/example/openglpractice/logic/Character;", "selectedRotation", "", "getSelectedRotation", "()B", "setSelectedRotation", "(B)V", "selectedTrap", "Lcom/example/openglpractice/logic/FeatureFactory;", "getSelectedTrap", "()Lcom/example/openglpractice/logic/FeatureFactory;", "setSelectedTrap", "(Lcom/example/openglpractice/logic/FeatureFactory;)V", "selectedTraps", "", "getSelectedTraps", "()Ljava/util/Set;", "setSelectedTraps", "(Ljava/util/Set;)V", "slime", "Lcom/example/openglpractice/logic/Enemy;", "topCharacterMatrix", "getTopCharacterMatrix", "setTopCharacterMatrix", "activateAnimation", "", "feature", "addTrapToData", "position", "Lcom/example/openglpractice/model/Vector;", "buildTrap", "idGenerate", "type", "initialise", "initialiseCharacterLayer", "Lcom/example/openglpractice/model/CharacterData;", "()[Lcom/example/openglpractice/model/CharacterData;", "initialiseFeatureLayer", "Lcom/example/openglpractice/model/AFeatureData;", "()[Lcom/example/openglpractice/model/AFeatureData;", "initialiseFieldLayer", "Lcom/example/openglpractice/model/FieldData;", "()[Lcom/example/openglpractice/model/FieldData;", "okToPutDown", "positionToHero", "to", "selectedFromThePalette", "selectedType", "", "app_debug"})
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
    private static com.example.openglpractice.logic.Character<?>[][] lowCharacterMatrix = {};
    @org.jetbrains.annotations.NotNull()
    private static com.example.openglpractice.logic.Character<?>[][] topCharacterMatrix = {};
    @org.jetbrains.annotations.NotNull()
    private static java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> selectedTraps;
    private static long idGen = 0L;
    private static boolean buildPhase = true;
    private static com.example.openglpractice.logic.Enemy slime;
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
    public final com.example.openglpractice.logic.Character<?>[][] getLowCharacterMatrix() {
        return null;
    }
    
    public final void setLowCharacterMatrix(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Character<?>[][] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Character<?>[][] getTopCharacterMatrix() {
        return null;
    }
    
    public final void setTopCharacterMatrix(@org.jetbrains.annotations.NotNull()
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
    
    private final com.example.openglpractice.model.FieldData[] initialiseFieldLayer() {
        return null;
    }
    
    private final com.example.openglpractice.model.AFeatureData<?>[] initialiseFeatureLayer() {
        return null;
    }
    
    private final com.example.openglpractice.model.CharacterData<?>[] initialiseCharacterLayer() {
        return null;
    }
    
    public final void selectedFromThePalette(int selectedType) {
    }
    
    private final long idGenerate(com.example.openglpractice.logic.FeatureFactory type) {
        return 0L;
    }
    
    public final void positionToHero(@org.jetbrains.annotations.NotNull()
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