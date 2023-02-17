package com.q32;

public class Q32 {
    public static int m1(int i){
        return i*i;
    }
    public static void main(String[] args) {
        // catching returned value
        int n = m1(2);
        System.out.println(n);
        int m = Q32.m1(3);
        System.out.println(m);

        // without catching returned value
        System.out.println(m1(2));
        System.out.println(Q32.m1(3));
    }
}
