package com.arm.malideveloper.openglessdk.graphicssetup;

public class NativeLibrary {
    static {
        System.loadLibrary("Native");
    }
    public static native void init();
}
