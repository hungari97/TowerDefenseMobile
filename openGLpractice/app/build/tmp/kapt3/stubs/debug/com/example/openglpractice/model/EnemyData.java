package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KBi\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u00107\u001a\u00020\u0004H\u00c6\u0003J\t\u00108\u001a\u00020\u0011H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\t\u0010<\u001a\u00020\tH\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\u0002H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0016\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0088\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u00d6\u0003J\t\u0010H\u001a\u00020\u0006H\u00d6\u0001J\t\u0010I\u001a\u00020JH\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b\'\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010\n\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006L"}, d2 = {"Lcom/example/openglpractice/model/EnemyData;", "Lcom/example/openglpractice/model/CharacterData;", "Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "goal", "path", "", "rotation", "", "functionality", "Lcom/example/openglpractice/logic/Enemy;", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;BLcom/example/openglpractice/logic/Enemy;)V", "getAnimationState", "()Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "setAnimationState", "(Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;)V", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Enemy;", "setFunctionality", "(Lcom/example/openglpractice/logic/Enemy;)V", "getGoal", "()Lcom/example/openglpractice/model/Vector;", "setGoal", "(Lcom/example/openglpractice/model/Vector;)V", "getHealth", "setHealth", "getHitBoxPosition", "setHitBoxPosition", "getHitBoxSize", "setHitBoxSize", "getId", "()J", "getPath", "()[Lcom/example/openglpractice/model/Vector;", "setPath", "([Lcom/example/openglpractice/model/Vector;)V", "[Lcom/example/openglpractice/model/Vector;", "getRotation", "()B", "setRotation", "(B)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;BLcom/example/openglpractice/logic/Enemy;)Lcom/example/openglpractice/model/EnemyData;", "equals", "", "other", "", "hashCode", "toString", "", "EnemyAnimateState", "app_debug"})
public final class EnemyData extends com.example.openglpractice.model.CharacterData<com.example.openglpractice.model.EnemyData.EnemyAnimateState> {
    private final long id = 0L;
    private int health;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.Vector hitBoxPosition;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.Vector hitBoxSize;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.EnemyData.EnemyAnimateState animationState;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector goal;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector[] path;
    private byte rotation;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.logic.Enemy functionality;
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getHealth() {
        return 0;
    }
    
    public void setHealth(int p0) {
    }
    
    @java.lang.Override()
    public int getDamage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.Vector getHitBoxPosition() {
        return null;
    }
    
    @java.lang.Override()
    public void setHitBoxPosition(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.Vector getHitBoxSize() {
        return null;
    }
    
    public void setHitBoxSize(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.EnemyData.EnemyAnimateState getAnimationState() {
        return null;
    }
    
    public void setAnimationState(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData.EnemyAnimateState p0) {
    }
    
    @java.lang.Override()
    public int getCurrentAnimationProgress() {
        return 0;
    }
    
    @java.lang.Override()
    public void setCurrentAnimationProgress(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.openglpractice.model.Vector getGoal() {
        return null;
    }
    
    public void setGoal(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.openglpractice.model.Vector[] getPath() {
        return null;
    }
    
    @java.lang.Override()
    public void setPath(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] p0) {
    }
    
    @java.lang.Override()
    public byte getRotation() {
        return 0;
    }
    
    @java.lang.Override()
    public void setRotation(byte p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.openglpractice.logic.Enemy getFunctionality() {
        return null;
    }
    
    public void setFunctionality(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Enemy p0) {
    }
    
    public EnemyData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData.EnemyAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, byte rotation, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Enemy functionality) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.Vector component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.Vector component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.EnemyData.EnemyAnimateState component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.model.Vector component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.model.Vector[] component9() {
        return null;
    }
    
    public final byte component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.logic.Enemy component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.EnemyData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData.EnemyAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, byte rotation, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Enemy functionality) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "", "Lcom/example/openglpractice/model/IFeatureEnum;", "(Ljava/lang/String;I)V", "calculateAnimationArray", "", "", "type", "", "rest", "", "(IZ)[[F", "calculateCurrentState", "minR", "minC", "maxR", "maxC", "changeToAction", "toAction", "", "textureArrayInitialise", "frameSizeX", "frameSizeY", "startingRow", "(III)[[F", "SLIMEREST", "SLIMEWALK", "SLIMEATTACK", "app_debug"})
    public static enum EnemyAnimateState implements com.example.openglpractice.model.IFeatureEnum {
        /*public static final*/ SLIMEREST /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState$SLIMEREST;", "Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "isWalking", "", "()Z", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) SLIMEREST(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            @java.lang.Override()
            public boolean isWalking() {
                return false;
            }
            
            SLIMEREST() {
                super();
            }
        } */,
        /*public static final*/ SLIMEWALK /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState$SLIMEWALK;", "Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "isWalking", "", "()Z", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) SLIMEWALK(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            @java.lang.Override()
            public boolean isWalking() {
                return false;
            }
            
            SLIMEWALK() {
                super();
            }
        } */,
        /*public static final*/ SLIMEATTACK /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState$SLIMEATTACK;", "Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "isWalking", "", "()Z", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) SLIMEATTACK(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            @java.lang.Override()
            public boolean isWalking() {
                return false;
            }
            
            SLIMEATTACK() {
                super();
            }
        } */;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.openglpractice.model.EnemyData.EnemyAnimateState changeToAction(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.model.EnemyData.EnemyAnimateState rest, @org.jetbrains.annotations.NotNull()
        java.lang.String toAction) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final float[] calculateCurrentState(int minR, int minC, int maxR, int maxC) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public float[][] calculateAnimationArray(int type, boolean rest) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final float[][] textureArrayInitialise(int frameSizeX, int frameSizeY, int startingRow) {
            return null;
        }
        
        EnemyAnimateState() {
        }
    }
}