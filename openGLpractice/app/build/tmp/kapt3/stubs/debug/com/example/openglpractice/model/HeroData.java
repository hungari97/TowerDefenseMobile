package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBo\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0002\u0010\u0015J\t\u00103\u001a\u00020\u0004H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\tH\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u0002H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0016\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u008e\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u00d6\u0003J\t\u0010D\u001a\u00020\u0006H\u00d6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u0006H"}, d2 = {"Lcom/example/openglpractice/model/HeroData;", "Lcom/example/openglpractice/model/CharacterData;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "goal", "path", "", "functionality", "Lcom/example/openglpractice/logic/Hero;", "trapTypes", "", "Lcom/example/openglpractice/logic/FeatureFactory;", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/HeroData$HeroAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/logic/Hero;Ljava/util/Set;)V", "getAnimationState", "()Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Hero;", "setFunctionality", "(Lcom/example/openglpractice/logic/Hero;)V", "getGoal", "()Lcom/example/openglpractice/model/Vector;", "setGoal", "(Lcom/example/openglpractice/model/Vector;)V", "getHealth", "getHitBoxPosition", "getHitBoxSize", "getId", "()J", "getPath", "()[Lcom/example/openglpractice/model/Vector;", "setPath", "([Lcom/example/openglpractice/model/Vector;)V", "[Lcom/example/openglpractice/model/Vector;", "getTrapTypes", "()Ljava/util/Set;", "setTrapTypes", "(Ljava/util/Set;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/HeroData$HeroAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/logic/Hero;Ljava/util/Set;)Lcom/example/openglpractice/model/HeroData;", "equals", "", "other", "", "hashCode", "toString", "", "HeroAnimateState", "app_debug"})
public final class HeroData extends com.example.openglpractice.model.CharacterData<com.example.openglpractice.model.HeroData.HeroAnimateState> {
    private final long id = 0L;
    private final int health = 0;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxSize = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.HeroData.HeroAnimateState animationState = null;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector goal;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector[] path;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.logic.Hero functionality;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> trapTypes;
    
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
    public com.example.openglpractice.model.HeroData.HeroAnimateState getAnimationState() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.openglpractice.logic.Hero getFunctionality() {
        return null;
    }
    
    public void setFunctionality(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Hero p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.example.openglpractice.logic.FeatureFactory> getTrapTypes() {
        return null;
    }
    
    public final void setTrapTypes(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> p0) {
    }
    
    public HeroData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.HeroData.HeroAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Hero functionality, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> trapTypes) {
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
    public final com.example.openglpractice.model.HeroData.HeroAnimateState component6() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.logic.Hero component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.example.openglpractice.logic.FeatureFactory> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.HeroData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.HeroData.HeroAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Hero functionality, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.example.openglpractice.logic.FeatureFactory> trapTypes) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "", "Lcom/example/openglpractice/model/IFeatureEnum;", "(Ljava/lang/String;I)V", "app_debug"})
    public static enum HeroAnimateState implements com.example.openglpractice.model.IFeatureEnum {
;
        
        HeroAnimateState() {
        }
    }
}