precision mediump float;// Set the default precision to medium. We don't need as high of a precision in the fragment shader.
uniform sampler2D u_Texture;// The input texture.

varying vec4 v_Position;// Interpolated position for this fragment.
//    varying vec4 v_Color;          	// This is the color from the vertex shader interpolated across the triangle per fragment.
//    varying vec3 v_Normal;         	// Interpolated normal for this fragment.
varying vec2 v_TexCoordinate;// Interpolated texture coordinate per fragment.

void main()
{
    if (vec4(1.0, 1.0, 1.0, 1.0) == texture2D(u_Texture, v_TexCoordinate)){
        gl_FragColor=vec4(0.0, 0.0, 0.0, 0.0);
    }
    else {
        gl_FragColor = texture2D(u_Texture, v_TexCoordinate);
    }
}