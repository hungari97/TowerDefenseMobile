package com.example.openglpractice.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&j\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/openglpractice/logic/EnemyFactory;", "", "(Ljava/lang/String;I)V", "createEnemy", "Lcom/example/openglpractice/logic/Enemy;", "position", "Lcom/example/openglpractice/model/Vector;", "id", "", "rotation", "", "SLIME", "app_debug"})
public enum EnemyFactory {
    /*public static final*/ SLIME /* = new @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/openglpractice/logic/EnemyFactory$SLIME;", "Lcom/example/openglpractice/logic/EnemyFactory;", "createEnemy", "Lcom/example/openglpractice/logic/Enemy;", "position", "Lcom/example/openglpractice/model/Vector;", "id", "", "rotation", "", "app_debug"}) SLIME(){
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.openglpractice.logic.Enemy createEnemy(@org.jetbrains.annotations.NotNull()
        com.example.openglpractice.model.Vector position, long id, byte rotation) {
            return null;
        }
        
        SLIME() {
            super();
        }
    } */;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.logic.Enemy createEnemy(@org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector position, long id, byte rotation);
    
    EnemyFactory() {
    }
}