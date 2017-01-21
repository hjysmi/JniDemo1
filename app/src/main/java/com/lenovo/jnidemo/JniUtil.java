package com.lenovo.jnidemo;

/**
 * Created by Administrator on 2017/1/21.
 */

public class JniUtil {
    static {
        System.loadLibrary("JniUtil");
    }

    public static native String getJniString();

    public static native int getJniAdd(int a, int b);
}
