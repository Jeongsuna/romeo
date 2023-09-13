package testcases.C6100_CMTBLOCK;

import java.lang.System;

public class C6100_CMTBLOCK__simple_01 {
    public void bad() {
        /* Non-compliant
         * Indentation
         */
        System.out.println("hello world"); /* Non-compliant
         * No BlankLine
         */
    }
    public void good() {
        /* Compliant
         * Block Comment
         */

        System.out.println("hello world");
    }
}
