package com.kh.chap02_String.run;

import com.kh.chap02_String.controller.A_StringPoolTest;
import com.kh.chap02_String.controller.B_StringMethodTest;
import com.kh.chap02_String.controller.C_StringTokenizerTest;

public class StringRun {
    public static void main(String[] args) {
        A_StringPoolTest a = new A_StringPoolTest();
        // a.method1();

        B_StringMethodTest b = new B_StringMethodTest();
        // b.method1();
        // b.method2();

        C_StringTokenizerTest c = new C_StringTokenizerTest();
        // c.method1();
        c.method2();
    }
}
