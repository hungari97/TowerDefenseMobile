package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012J\t\u0010,\u001a\u00020\u0004H\u00c6\u0003J\t\u0010-\u001a\u00020\u0004H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\t\u00102\u001a\u00020\u0002H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003Jo\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020\u0006H\u00d6\u0001J\t\u0010<\u001a\u00020=H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006?"}, d2 = {"Lcom/example/openglpractice/model/TrapData;", "Lcom/example/openglpractice/model/AFeatureData;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "functionality", "Lcom/example/openglpractice/logic/Trap;", "rotation", "", "coolDown", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/TrapData$TrapAnimationState;ILcom/example/openglpractice/logic/Trap;BJ)V", "getAnimationState", "()Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "setAnimationState", "(Lcom/example/openglpractice/model/TrapData$TrapAnimationState;)V", "getCoolDown", "()J", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Trap;", "setFunctionality", "(Lcom/example/openglpractice/logic/Trap;)V", "getHealth", "setHealth", "getHitBoxPosition", "()Lcom/example/openglpractice/model/Vector;", "getHitBoxSize", "getId", "getRotation", "()B", "setRotation", "(B)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "TrapAnimationState", "app_debug"})
public final class TrapData extends com.example.openglpractice.model.AFeatureData<com.example.openglpractice.model.TrapData.TrapAnimationState> {
    private final long id = 0L;
    private int health;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxSize = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.openglpractice.model.TrapData.TrapAnimationState animationState;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.Nullable()
    private com.example.openglpractice.logic.Trap functionality;
    private byte rotation;
    private final long coolDown = 0L;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.Vector getHitBoxSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.model.TrapData.TrapAnimationState getAnimationState() {
        return null;
    }
    
    public void setAnimationState(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData.TrapAnimationState p0) {
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
    public com.example.openglpractice.logic.Trap getFunctionality() {
        return null;
    }
    
    public void setFunctionality(@org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Trap p0) {
    }
    
    @java.lang.Override()
    public byte getRotation() {
        return 0;
    }
    
    @java.lang.Override()
    public void setRotation(byte p0) {
    }
    
    public final long getCoolDown() {
        return 0L;
    }
    
    public TrapData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData.TrapAnimationState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Trap functionality, byte rotation, long coolDown) {
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
    public final com.example.openglpractice.model.TrapData.TrapAnimationState component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.openglpractice.logic.Trap component8() {
        return null;
    }
    
    public final byte component9() {
        return 0;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.TrapData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData.TrapAnimationState animationState, int currentAnimationProgress, @org.jetbrains.annotations.Nullable()
    com.example.openglpractice.logic.Trap functionality, byte rotation, long coolDown) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "", "Lcom/example/openglpractice/model/IAnimateEnum;", "(Ljava/lang/String;I)V", "calculateAnimationArray", "", "", "type", "", "rest", "", "(IZ)[[F", "calculateCurrentState", "minR", "minC", "maxR", "maxC", "changeToAttack", "textureArrayInitialise", "frameSizeX", "frameSizeY", "startingRow", "(III)[[F", "SPIKEREST", "SPIKEATTACK", "FIREREST", "FIREATTACK", "app_debug"})
    public static enum TrapAnimationState implements com.example.openglpractice.model.IAnimateEnum {
        /*public static final*/ SPIKEREST /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$SPIKEREST;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) SPIKEREST(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            SPIKEREST() {
                super();
            }
        } */,
        /*public static final*/ SPIKEATTACK /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$SPIKEATTACK;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) SPIKEATTACK(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            SPIKEATTACK() {
                super();
            }
        } */,
        /*public static final*/ FIREREST /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$FIREREST;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) FIREREST(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            FIREREST() {
                super();
            }
        } */,
        /*public static final*/ FIREATTACK /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$FIREATTACK;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureArray", "", "", "getTextureArray", "()[[F", "textureArray$delegate", "Lkotlin/Lazy;", "app_debug"}) FIREATTACK(){
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy textureArray$delegate = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[][] getTextureArray() {
                return null;
            }
            
            FIREATTACK() {
                super();
            }
        } */;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.openglpractice.model.TrapData.TrapAnimationState changeToAttack(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.model.TrapData.TrapAnimationState rest) {
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
        
        TrapAnimationState() {
        }
    }
}