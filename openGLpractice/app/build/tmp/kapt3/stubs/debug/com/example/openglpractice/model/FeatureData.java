package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u0002H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003JY\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u0006H\u00d6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00060"}, d2 = {"Lcom/example/openglpractice/model/FeatureData;", "Lcom/example/openglpractice/model/AFeatureData;", "Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "functionality", "Lcom/example/openglpractice/logic/Feature;", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;ILcom/example/openglpractice/logic/Feature;)V", "getAnimationState", "()Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Feature;", "getHealth", "getHitBoxPosition", "()Lcom/example/openglpractice/model/Vector;", "getHitBoxSize", "getId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "", "FeatureAnimateState", "app_debug"})
public final class FeatureData extends com.example.openglpractice.model.AFeatureData<com.example.openglpractice.model.FeatureData.FeatureAnimateState> {
    private final long id = 0L;
    private final int health = 0;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxSize = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.FeatureData.FeatureAnimateState animationState = null;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.logic.Feature functionality = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.Vector getHitBoxSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.FeatureData.FeatureAnimateState getAnimationState() {
        return null;
    }
    
    @java.lang.Override()
    public int getCurrentAnimationProgress() {
        return 0;
    }
    
    @java.lang.Override()
    public void setCurrentAnimationProgress(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.logic.Feature getFunctionality() {
        return null;
    }
    
    public FeatureData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FeatureData.FeatureAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Feature functionality) {
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
    public final com.example.openglpractice.model.FeatureData.FeatureAnimateState component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Feature component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.FeatureData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FeatureData.FeatureAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Feature functionality) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "", "Lcom/example/openglpractice/model/IFeatureEnum;", "(Ljava/lang/String;I)V", "app_debug"})
    public static enum FeatureAnimateState implements com.example.openglpractice.model.IFeatureEnum {
;
        
        FeatureAnimateState() {
        }
    }
}