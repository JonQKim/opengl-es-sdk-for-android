package com.arm.malideveloper.openglessdk.normalmapping;

public class NativeLibrary {
    static {
        System.loadLibrary("Native");
    }
    public static native void init(int width, int height);
    public static native void step();
}
