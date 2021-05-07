package com.sina.androidopenglone;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class WGLSufaceView extends GLSurfaceView {

    private WGLRender wglRender;

    public WGLSufaceView(Context context) {
        super(context);
    }

    public WGLSufaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        wglRender = new WGLRender();
        setRenderer(wglRender);
    }
}
