package com.company;

public class Test {

    Integer sum = 0;


    private int sum(int n) {
        int sum = 0;
        if(n / 10 == 0) {
            return sum = n% 10;
        }
        sum += n%10 + sum(n/10);
        return sum;
    }

    public static void main(String args[] ) {
        Test test = new Test();
        System.out.println(test.sum(1234));
    }
}
