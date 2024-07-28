package com.arm.malideveloper.openglessdk.firstnative;

public class NativeLibrary {
    static {
        System.loadLibrary("Native");
    }
    public static native void init();
}
