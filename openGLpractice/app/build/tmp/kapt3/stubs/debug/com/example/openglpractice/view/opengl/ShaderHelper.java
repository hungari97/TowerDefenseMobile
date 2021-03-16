package com.example.openglpractice.view.opengl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004J-\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/openglpractice/view/opengl/ShaderHelper;", "", "()V", "TAG", "", "compileShader", "", "shaderType", "shaderSource", "createAndLinkProgram", "vertexShaderHandle", "fragmentShaderHandle", "attributes", "", "(II[Ljava/lang/String;)I", "app_debug"})
public final class ShaderHelper {
    private static final java.lang.String TAG = "ShaderHelper";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.openglpractice.view.opengl.ShaderHelper INSTANCE = null;
    
    /**
     * Helper function to compile a shader.
     *
     * @param shaderType The shader type.
     * @param shaderSource The shader source code.
     * @return An OpenGL handle to the shader.
     */
    public final int compileShader(int shaderType, @org.jetbrains.annotations.Nullable()
    java.lang.String shaderSource) {
        return 0;
    }
    
    /**
     * Helper function to compile and link a program.
     *
     * @param vertexShaderHandle An OpenGL handle to an already-compiled vertex shader.
     * @param fragmentShaderHandle An OpenGL handle to an already-compiled fragment shader.
     * @param attributes Attributes that need to be bound to the program.
     * @return An OpenGL handle to the program.
     */
    public final int createAndLinkProgram(int vertexShaderHandle, int fragmentShaderHandle, @org.jetbrains.annotations.Nullable()
    java.lang.String[] attributes) {
        return 0;
    }
    
    private ShaderHelper() {
        super();
    }
}