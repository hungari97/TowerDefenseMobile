package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/openglpractice/logic/FeatureFactory;", "", "(Ljava/lang/String;I)V", "iconIndex", "", "getIconIndex", "()I", "createFeature", "Lcom/example/openglpractice/logic/AFeature;", "position", "Lcom/example/openglpractice/model/Vector;", "TRAP", "app_debug"})
public enum FeatureFactory {
    /*public static final*/ TRAP /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/example/openglpractice/logic/FeatureFactory$TRAP;", "Lcom/example/openglpractice/logic/FeatureFactory;", "iconIndex", "", "getIconIndex", "()I", "createFeature", "Lcom/example/openglpractice/logic/Trap;", "position", "Lcom/example/openglpractice/model/Vector;", "app_debug"}) TRAP(){
        
        @java.lang.Override()
        public int getIconIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.openglpractice.logic.Trap createFeature(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.model.Vector position) {
            return null;
        }
        
        TRAP() {
            super();
        }
    } */;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.logic.AFeature<?> createFeature(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position);
    
    public abstract int getIconIndex();
    
    FeatureFactory() {
    }
}