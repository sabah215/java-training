package com.q28;

public class Q28 {
    public static int m1(int i){
        System.out.println("m1 method");
        return i*i;
    }
    public static void main(String[] args) {
       int x =  m1(5);
        int total = 100 + x;
        System.out.println(total);
    }
}

// Output: m1 method
//         125