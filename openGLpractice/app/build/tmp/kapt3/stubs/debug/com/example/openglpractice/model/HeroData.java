package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SBw\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\u0010\u0017J\t\u0010>\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010@\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\t\u0010D\u001a\u00020\tH\u00c6\u0003J\t\u0010E\u001a\u00020\tH\u00c6\u0003J\t\u0010F\u001a\u00020\u0002H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0016\u0010I\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0098\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u00d6\u0003J\t\u0010P\u001a\u00020\u0006H\u00d6\u0001J\t\u0010Q\u001a\u00020RH\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010\n\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u00a8\u0006T"}, d2 = {"Lcom/example/openglpractice/model/HeroData;", "Lcom/example/openglpractice/model/CharacterData;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "goal", "path", "", "functionality", "Lcom/example/openglpractice/logic/Hero;", "rotation", "", "trapTypes", "", "Lcom/example/openglpractice/logic/FeatureFactory;", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/HeroData$HeroAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/logic/Hero;BLjava/util/Set;)V", "getAnimationState", "()Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "setAnimationState", "(Lcom/example/openglpractice/model/HeroData$HeroAnimateState;)V", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Hero;", "setFunctionality", "(Lcom/example/openglpractice/logic/Hero;)V", "getGoal", "()Lcom/example/openglpractice/model/Vector;", "setGoal", "(Lcom/example/openglpractice/model/Vector;)V", "getHealth", "setHealth", "getHitBoxPosition", "setHitBoxPosition", "getHitBoxSize", "setHitBoxSize", "getId", "()J", "getPath", "()[Lcom/example/openglpractice/model/Vector;", "setPath", "([Lcom/example/openglpractice/model/Vector;)V", "[Lcom/example/openglpractice/model/Vector;", "getRotation", "()B", "setRotation", "(B)V", "getTrapTypes", "()Ljava/util/Set;", "setTrapTypes", "(Ljava/util/Set;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/HeroData$HeroAnimateState;ILcom/example/openglpractice/model/Vector;[Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/logic/Hero;BLjava/util/Set;)Lcom/example/openglpractice/model/HeroData;", "equals", "", "other", "", "hashCode", "toString", "", "HeroAnimateState", "app_debug"})
public final class HeroData extends com.example.openglpractice.model.CharacterData<com.example.openglpractice.model.HeroData.HeroAnimateState> {
    private final long id = 0L;
    private int health;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.Vector hitBoxPosition;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.Vector hitBoxSize;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.HeroData.HeroAnimateState animationState;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector goal;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.model.Vector[] path;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.logic.Hero functionality;
    private byte rotation;
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
    
    @java.lang.Override()
    public void setHitBoxSize(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.HeroData.HeroAnimateState getAnimationState() {
        return null;
    }
    
    public void setAnimationState(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.HeroData.HeroAnimateState p0) {
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
    
    @java.lang.Override()
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
    
    @java.lang.Override()
    public byte getRotation() {
        return 0;
    }
    
    @java.lang.Override()
    public void setRotation(byte p0) {
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
    com.example.openglpractice.logic.Hero functionality, byte rotation, @org.jetbrains.annotations.NotNull()
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
    
    public final byte component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.example.openglpractice.logic.FeatureFactory> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.HeroData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.HeroData.HeroAnimateState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector goal, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.model.Vector[] path, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Hero functionality, byte rotation, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "", "Lcom/example/openglpractice/model/ICharacterAnimationEnum;", "(Ljava/lang/String;I)V", "calculateAnimationArray", "", "", "type", "", "rest", "", "(IZ)[[F", "calculateCurrentState", "minR", "minC", "maxR", "maxC", "textureArrayInitialise", "frameSizeX", "frameSizeY", "startingRow", "(III)[[F", "HEROREST", "HEROWALK", "HEROATTACK", "app_debug"})
    public static enum HeroAnimateState implements com.example.openglpractice.model.ICharacterAnimationEnum {
        /*public static final*/ HEROREST /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/model/HeroData$HeroAnimateState$HEROREST;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "action", "Lcom/example/openglpractice/model/EActionType;", "getAction", "()Lcom/example/openglpractice/model/EActionType;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) HEROREST(){
            @org.jetbrains.annotations.NotNull()
            private final com.example.openglpractice.model.EActionType action = com.example.openglpractice.model.EActionType.REST;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.example.openglpractice.model.EActionType getAction() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            HEROREST() {
                super();
            }
        } */,
        /*public static final*/ HEROWALK /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/model/HeroData$HeroAnimateState$HEROWALK;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "action", "Lcom/example/openglpractice/model/EActionType;", "getAction", "()Lcom/example/openglpractice/model/EActionType;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) HEROWALK(){
            @org.jetbrains.annotations.NotNull()
            private final com.example.openglpractice.model.EActionType action = com.example.openglpractice.model.EActionType.WALK;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.example.openglpractice.model.EActionType getAction() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            HEROWALK() {
                super();
            }
        } */,
        /*public static final*/ HEROATTACK /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/openglpractice/model/HeroData$HeroAnimateState$HEROATTACK;", "Lcom/example/openglpractice/model/HeroData$HeroAnimateState;", "action", "Lcom/example/openglpractice/model/EActionType;", "getAction", "()Lcom/example/openglpractice/model/EActionType;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) HEROATTACK(){
            @org.jetbrains.annotations.NotNull()
            private final com.example.openglpractice.model.EActionType action = com.example.openglpractice.model.EActionType.ATTACK;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.example.openglpractice.model.EActionType getAction() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            HEROATTACK() {
                super();
            }
        } */;
        
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
        
        HeroAnimateState() {
        }
    }
}