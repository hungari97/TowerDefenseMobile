package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u00100\u001a\u00020\u0004H\u00c6\u0003J\t\u00101\u001a\u00020\u0011H\u00c6\u0003J\t\u00102\u001a\u00020\u0013H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\t\u00107\u001a\u00020\u0002H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0016\u0010:\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0086\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0006H\u00d6\u0001J\t\u0010B\u001a\u00020CH\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001f\"\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006E"}, d2 = {"Lcom/example/openglpractice/model/EnemyData;", "Lcom/example/openglpractice/model/CharacterData;", "Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "goal", "path", "", "rotation", "", "functionality", "Lcom/example/openglpractice/logic/Interactable;", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;BLcom/example/openglpractice/logic/Interactable;)V", "getAnimationState", "()Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Interactable;", "getGoal", "()Lcom/example/openglpractice/model/Vector;", "getHealth", "getHitBoxPosition", "setHitBoxPosition", "(Lcom/example/openglpractice/model/Vector;)V", "getHitBoxSize", "getId", "()J", "getPath", "()[Lcom/example/openglpractice/model/Vector;", "setPath", "([Lcom/example/openglpractice/model/Vector;)V", "[Lcom/example/openglpractice/model/Vector;", "getRotation", "()B", "setRotation", "(B)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;BLcom/example/openglpractice/logic/Interactable;)Lcom/example/openglpractice/model/EnemyData;", "equals", "", "other", "", "hashCode", "toString", "", "EnemyAnimateState", "app_debug"})
public final class EnemyData extends com.example.openglpractice.model.CharacterData<com.example.openglpractice.model.EnemyData.EnemyAnimateState> {
    private final long id = 0L;
    private final int health = 0;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.Vector hitBoxPosition;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxSize = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.EnemyData.EnemyAnimateState animationState = null;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.Nullable()
    private final com.example.openglpractice.model.Vector goal = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector[] path;
    private byte rotation;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.logic.Interactable functionality = null;
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int getHealth() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.EnemyData.EnemyAnimateState getAnimationState() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.logic.Interactable getFunctionality() {
        return null;
    }
    
    public EnemyData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData.EnemyAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, byte rotation, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable functionality) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Interactable component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.EnemyData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.EnemyData.EnemyAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, byte rotation, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Interactable functionality) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/openglpractice/model/EnemyData$EnemyAnimateState;", "", "Lcom/example/openglpractice/model/IFeatureEnum;", "(Ljava/lang/String;I)V", "app_debug"})
    public static enum EnemyAnimateState implements com.example.openglpractice.model.IFeatureEnum {
;
        
        EnemyAnimateState() {
        }
    }
}