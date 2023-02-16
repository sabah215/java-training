package com.q13;

public class Q13 {
    int x=10;
    public void show(){
        int x = 100;
        System.out.println(x);
        System.out.println(this.x);

    }
    public static void main(String[] args) {
        Q13 q = new Q13();
        q.show();
    }
}
