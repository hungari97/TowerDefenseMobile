package com.example.openglpractice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/openglpractice/model/ICharacterAnimationEnum;", "Lcom/example/openglpractice/model/IAnimateEnum;", "action", "Lcom/example/openglpractice/model/EActionType;", "getAction", "()Lcom/example/openglpractice/model/EActionType;", "app_debug"})
public abstract interface ICharacterAnimationEnum extends com.example.openglpractice.model.IAnimateEnum {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.openglpractice.model.EActionType getAction();
}