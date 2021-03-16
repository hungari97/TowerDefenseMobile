package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\bH\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/example/openglpractice/model/CollisionSectorData;", "", "id", "", "sectorPosition", "Lcom/example/openglpractice/model/Vector;", "sectorSize", "capacity", "", "inventory", "", "Lcom/example/openglpractice/model/InteractableData;", "(JLcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;I[Lcom/example/openglpractice/model/InteractableData;)V", "getCapacity", "()I", "getId", "()J", "getInventory", "()[Lcom/example/openglpractice/model/InteractableData;", "[Lcom/example/openglpractice/model/InteractableData;", "getSectorPosition", "()Lcom/example/openglpractice/model/Vector;", "getSectorSize", "component1", "component2", "component3", "component4", "component5", "copy", "(JLcom/example/openglpractice/model/Vector;Lcom/example/openglpractice/model/Vector;I[Lcom/example/openglpractice/model/InteractableData;)Lcom/example/openglpractice/model/CollisionSectorData;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class CollisionSectorData {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector sectorPosition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.Vector sectorSize = null;
    private final int capacity = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.openglpractice.model.InteractableData[] inventory = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.Vector getSectorPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.Vector getSectorSize() {
        return null;
    }
    
    public final int getCapacity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.InteractableData[] getInventory() {
        return null;
    }
    
    public CollisionSectorData(long id, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector sectorPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector sectorSize, int capacity, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.InteractableData[] inventory) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.Vector component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.Vector component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.InteractableData[] component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.openglpractice.model.CollisionSectorData copy(long id, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector sectorPosition, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.Vector sectorSize, int capacity, @org.jetbrains.annotations.NotNull()
    com.example.openglpractice.model.InteractableData[] inventory) {
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
}