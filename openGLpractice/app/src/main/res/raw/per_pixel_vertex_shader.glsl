uniform mat4 u_MVPMatrix;// A constant representing the combined model/view/projection matrix.
//uniform mat4 u_MVMatrix;// A constant representing the combined model/view matrix.

attribute vec4 a_Position;// Per-vertex position information we will pass in.
//    "attribute vec4 a_Color;"+			// Per-vertex color information we will pass in.
//    "attribute vec3 a_Normal;"+		// Per-vertex normal information we will pass in.
attribute vec2 a_TexCoordinate;// Per-vertex texture coordinate information we will pass in.

varying vec4 v_Position;// This will be passed into the fragment shader.
//    "varying vec4 v_Color;"			// This will be passed into the fragment shader.
//    "varying vec3 v_Normal;"			// This will be passed into the fragment shader.
varying vec2 v_TexCoordinate;// This will be passed into the fragment shader.

void main()
{
    // Transform the vertex into eye space.
    //v_Position = vec3(u_MVMatrix * a_Position);
    //v_Color = a_Color;"// Pass through the color.
//    mat4 Matrix=u_MVMatrix;
    v_TexCoordinate = a_TexCoordinate;// Pass through the texture coordinate.
    //v_Normal = vec3(u_MVMatrix * vec4(a_Normal, 0.0));
    // Transform the normal's orientation into eye space.
    // gl_Position is a special variable used to store the final position.
    // Multiply the vertex by the matrix to get the final point in normalized screen coordinates.
    v_Position =  u_MVPMatrix *a_Position;//
    gl_Position =  u_MVPMatrix *a_Position;//
}
