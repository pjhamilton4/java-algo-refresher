package com.philiphamilton.algorithms.recursion;

public class Basic {

    public static long factorial(long n) {
        //System.out.println("In factorial with input as: " + n);
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static int fib(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
