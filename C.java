package com.anz.cobra.common.app.utils.string;

class A {
    protected void test() {
        System.out.println("This is A");
    }
}

class B extends A {

    @Override
    protected void test() {
        System.out.println("This is B");
    }

}

public class C {
    public static void main(String[] args) {
        B a = new B();
        a.test();
    }
}
