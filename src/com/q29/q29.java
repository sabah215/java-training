package com.q29;

public class q29 {
    public static float m1(int i){
        System.out.println("m1 called");
        return i*i;
    }
    public static void main(String[] args) {
//        m1(2);
        float x= m1(2);
        int total = 100 + (int) x;
        System.out.println(total);
    }
}

// Output: m1 called
//         104