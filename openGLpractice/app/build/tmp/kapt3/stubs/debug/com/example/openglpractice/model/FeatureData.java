package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010)\u001a\u00020\u0004H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\u0002H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Je\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u00020\u0006H\u00d6\u0001J\t\u00108\u001a\u000209H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006;"}, d2 = {"Lcom/example/openglpractice/model/FeatureData;", "Lcom/example/openglpractice/model/AFeatureData;", "Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "rotation", "", "functionality", "Lcom/example/openglpractice/logic/Feature;", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;IBLcom/example/openglpractice/logic/Feature;)V", "getAnimationState", "()Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "setAnimationState", "(Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;)V", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Feature;", "setFunctionality", "(Lcom/example/openglpractice/logic/Feature;)V", "getHealth", "getHitBoxPosition", "()Lcom/example/openglpractice/model/Vector;", "getHitBoxSize", "getId", "()J", "getRotation", "()B", "setRotation", "(B)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "FeatureAnimateState", "app_debug"})
public final class FeatureData extends com.example.openglpractice.model.AFeatureData<com.example.openglpractice.model.FeatureData.FeatureAnimateState> {
    private final long id = 0L;
    private final int health = 0;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxSize = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.FeatureData.FeatureAnimateState animationState;
    private int currentAnimationProgress;
    private byte rotation;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.logic.Feature functionality;
    
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
    
    public void setAnimationState(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FeatureData.FeatureAnimateState p0) {
    }
    
    @java.lang.Override()
    public int getCurrentAnimationProgress() {
        return 0;
    }
    
    @java.lang.Override()
    public void setCurrentAnimationProgress(int p0) {
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
    public com.example.openglpractice.logic.Feature getFunctionality() {
        return null;
    }
    
    public void setFunctionality(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Feature p0) {
    }
    
    public FeatureData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FeatureData.FeatureAnimateState animationState, int currentAnimationProgress, byte rotation, @org.jetbrains.annotations.Nullable()
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
    
    public final byte component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.logic.Feature component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.FeatureData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.FeatureData.FeatureAnimateState animationState, int currentAnimationProgress, byte rotation, @org.jetbrains.annotations.Nullable()
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010\rJ&\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006j\u0002\b\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "", "Lcom/example/openglpractice/model/IFeatureEnum;", "(Ljava/lang/String;I)V", "isWalking", "", "()Z", "calculateAnimationArray", "", "", "type", "", "rest", "(IZ)[[F", "calculateCurrentState", "minR", "minC", "maxR", "maxC", "changeToAttack", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureArrayInitialise", "frameSizeX", "frameSizeY", "startingRow", "(III)[[F", "CRYSTAL", "app_debug"})
    public static enum FeatureAnimateState implements com.example.openglpractice.model.IFeatureEnum {
        /*public static final*/ CRYSTAL /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState$CRYSTAL;", "Lcom/example/openglpractice/model/FeatureData$FeatureAnimateState;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) CRYSTAL(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            CRYSTAL() {
                super();
            }
        } */;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.openglpractice.model.TrapData.TrapAnimationState changeToAttack(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.model.TrapData.TrapAnimationState rest) {
            return null;
        }
        
        @java.lang.Override()
        public boolean isWalking() {
            return false;
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
        
        FeatureAnimateState() {
        }
    }
}