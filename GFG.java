package com.anz.cobra.common.app.utils.string;

// Java program to explain the
// concept of joining a thread.

import java.io.*;

// Creating thread by creating the
// objects of that class
class ThreadJoining extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
//                Thread.sleep(500);
                System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has" +
                    " been caught" + ex);
            }
            System.out.println(i);
        }
    }
}

class GFG {
    public static void main(String[] args) throws InterruptedException {

        Check check = new Check();
        check.clone();

        // creating two threads
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();

        System.out.println(t1.getName() + " state is : " + t1.getState());
        // thread t1 starts
        t1.start();
//        t1.join();
        System.out.println(t1.getName() + " completed. State : " + t1.getState());
        t2.start();
        t2.wait();
        t1.yield();
//        t2.join();
        // starts second thread after when
        // first thread t1 has died.
//        try {
//            System.out.println("Current Thread: "
//                + Thread.currentThread().getName());
////            t1.join();
//        } catch (Exception ex) {
//            System.out.println("Exception has " +
//                "been caught" + ex);
//        }
//
//        // t2 starts
//        t2.start();
//
//        // starts t3 after when thread t2 has died.
//        try {
//            System.out.println("Current Thread: "
//                + Thread.currentThread().getName());
//            t2.join();
//        } catch (Exception ex) {
//            System.out.println("Exception has been" +
//                " caught" + ex);
//        }
//
//        t3.start();
    }
}

