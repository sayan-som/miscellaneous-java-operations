package com.anz.cobra.common.app.utils.string;

interface SomeInterface {
    
    default void someMethod() {
        System.out.println("This is the implementation");
    }

    static void staticMethod() {

    }
    
}
