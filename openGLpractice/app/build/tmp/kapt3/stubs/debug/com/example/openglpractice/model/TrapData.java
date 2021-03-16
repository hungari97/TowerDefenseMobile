package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\u0004H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0002H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003J\t\u0010*\u001a\u00020\u0004H\u00c6\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u0006H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014\u00a8\u00064"}, d2 = {"Lcom/example/openglpractice/model/TrapData;", "Lcom/example/openglpractice/model/AFeatureData;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "id", "", "health", "", "damage", "hitBoxPosition", "Lcom/example/openglpractice/model/Vector;", "hitBoxSize", "animationState", "currentAnimationProgress", "functionality", "Lcom/example/openglpractice/logic/Trap;", "coolDown", "(JIILcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/TrapData$TrapAnimationState;ILcom/example/openglpractice/logic/Trap;J)V", "getAnimationState", "()Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "getCoolDown", "()J", "getCurrentAnimationProgress", "()I", "setCurrentAnimationProgress", "(I)V", "getDamage", "getFunctionality", "()Lcom/example/openglpractice/logic/Trap;", "getHealth", "setHealth", "getHitBoxPosition", "()Lcom/example/openglpractice/model/Vector;", "getHitBoxSize", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "TrapAnimationState", "app_debug"})
public final class TrapData extends com.example.openglpractice.model.AFeatureData<com.example.openglpractice.model.TrapData.TrapAnimationState> {
    private final long id = 0L;
    private int health;
    private final int damage = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector hitBoxSize = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.TrapData.TrapAnimationState animationState = null;
    private int currentAnimationProgress;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.logic.Trap functionality = null;
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
    
    @java.lang.Override()
    public int getCurrentAnimationProgress() {
        return 0;
    }
    
    @java.lang.Override()
    public void setCurrentAnimationProgress(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.openglpractice.logic.Trap getFunctionality() {
        return null;
    }
    
    public final long getCoolDown() {
        return 0L;
    }
    
    public TrapData(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData.TrapAnimationState animationState, int currentAnimationProgress, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Trap functionality, long coolDown) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.logic.Trap component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.TrapData copy(long id, int health, int damage, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector hitBoxSize, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.TrapData.TrapAnimationState animationState, int currentAnimationProgress, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.logic.Trap functionality, long coolDown) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "", "Lcom/example/openglpractice/model/IFeatureEnum;", "(Ljava/lang/String;I)V", "valueOfCurrentState", "", "state", "", "REST_0", "ATTACK_0", "ATTACK_1", "ATTACK_2", "ATTACK_3", "ATTACK_4", "ATTACK_5", "ATTACK_6", "ATTACK_7", "ATTACK_8", "ATTACK_9", "ATTACK_10", "ATTACK_11", "ATTACK_12", "ATTACK_13", "ATTACK_14", "ATTACK_15", "app_debug"})
    public static enum TrapAnimationState implements com.example.openglpractice.model.IFeatureEnum {
        /*public static final*/ REST_0 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$REST_0;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) REST_0(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.0625F, 0.14285715F, 0.0625F, 0.2857143F, 0.0F, 0.14285715F, 0.0625F, 0.2857143F, 0.0F, 0.2857143F, 0.0F, 0.14285715F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            REST_0() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_0 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_0;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_0(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.0625F, 0.2857143F, 0.0625F, 0.42857143F, 0.0F, 0.2857143F, 0.0625F, 0.42857143F, 0.0F, 0.42857143F, 0.0F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_0() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_1 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_1;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_1(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.125F, 0.2857143F, 0.125F, 0.42857143F, 0.0625F, 0.2857143F, 0.125F, 0.42857143F, 0.0625F, 0.42857143F, 0.0625F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_1() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_2 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_2;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_2(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.1875F, 0.2857143F, 0.1875F, 0.42857143F, 0.125F, 0.2857143F, 0.1875F, 0.42857143F, 0.125F, 0.42857143F, 0.125F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_2() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_3 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_3;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_3(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.25F, 0.2857143F, 0.25F, 0.42857143F, 0.1875F, 0.2857143F, 0.25F, 0.42857143F, 0.1875F, 0.42857143F, 0.1875F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_3() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_4 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_4;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_4(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.3125F, 0.2857143F, 0.3125F, 0.42857143F, 0.25F, 0.2857143F, 0.3125F, 0.42857143F, 0.25F, 0.42857143F, 0.25F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_4() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_5 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_5;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_5(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.375F, 0.2857143F, 0.375F, 0.42857143F, 0.3125F, 0.2857143F, 0.375F, 0.42857143F, 0.3125F, 0.42857143F, 0.3125F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_5() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_6 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_6;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_6(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.4375F, 0.2857143F, 0.4375F, 0.42857143F, 0.375F, 0.2857143F, 0.4375F, 0.42857143F, 0.375F, 0.42857143F, 0.375F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_6() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_7 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_7;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_7(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.5F, 0.2857143F, 0.5F, 0.42857143F, 0.4375F, 0.2857143F, 0.5F, 0.42857143F, 0.4375F, 0.42857143F, 0.4375F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_7() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_8 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_8;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_8(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.5625F, 0.2857143F, 0.5625F, 0.42857143F, 0.5F, 0.2857143F, 0.5625F, 0.42857143F, 0.5F, 0.42857143F, 0.5F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_8() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_9 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_9;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_9(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.625F, 0.2857143F, 0.625F, 0.42857143F, 0.5625F, 0.2857143F, 0.625F, 0.42857143F, 0.5625F, 0.42857143F, 0.5625F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_9() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_10 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_10;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_10(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.6875F, 0.2857143F, 0.6875F, 0.42857143F, 0.625F, 0.2857143F, 0.6875F, 0.42857143F, 0.625F, 0.42857143F, 0.625F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_10() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_11 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_11;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_11(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.75F, 0.2857143F, 0.75F, 0.42857143F, 0.6875F, 0.2857143F, 0.75F, 0.42857143F, 0.6875F, 0.42857143F, 0.6875F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_11() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_12 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_12;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_12(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.8125F, 0.2857143F, 0.8125F, 0.42857143F, 0.75F, 0.2857143F, 0.8125F, 0.42857143F, 0.75F, 0.42857143F, 0.75F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_12() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_13 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_13;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_13(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.875F, 0.2857143F, 0.875F, 0.42857143F, 0.8125F, 0.2857143F, 0.875F, 0.42857143F, 0.8125F, 0.42857143F, 0.8125F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_13() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_14 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_14;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_14(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {0.9375F, 0.2857143F, 0.9375F, 0.42857143F, 0.875F, 0.2857143F, 0.9375F, 0.42857143F, 0.875F, 0.42857143F, 0.875F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_14() {
                super();
            }
        } */,
        /*public static final*/ ATTACK_15 /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/TrapData$TrapAnimationState$ATTACK_15;", "Lcom/example/openglpractice/model/TrapData$TrapAnimationState;", "textureIndexes", "", "getTextureIndexes", "()[F", "app_debug"}) ATTACK_15(){
            @org.jetbrains.annotations.NotNull()
            private final float[] textureIndexes = {1.0F, 0.2857143F, 1.0F, 0.42857143F, 0.9375F, 0.2857143F, 1.0F, 0.42857143F, 0.9375F, 0.42857143F, 0.9375F, 0.2857143F};
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public float[] getTextureIndexes() {
                return null;
            }
            
            ATTACK_15() {
                super();
            }
        } */;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public float[] valueOfCurrentState(int state) {
            return null;
        }
        
        TrapAnimationState() {
        }
    }
}