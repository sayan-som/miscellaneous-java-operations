package com.anz.cobra.common.app.utils.string;

class ABC {


//    static {
//        System.out.println("Inside ABC");
//    }

    public static void test()
    {
        System.out.println("Hello");
    }
}
    public class Check implements Cloneable{

        static {
            System.out.println("Inside Check");
        }
        public static void main(String[] args) {
            int x = 5;
            System.out.println(x^5);
            ABC abc = null;
            abc.test();
        }

        public static class DEF {
            static {
                System.out.println("This is static class DEF");
            }
        }
    }
