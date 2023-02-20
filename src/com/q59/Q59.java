package com.q59;

public class Q59 {
    public static void main(String[] args) {
        String s = new String("Hello");
        s = null;

        // Requesting JVM to call garbage collector method
        System.gc();
        System.out.println("Main method completed");
    }


    @Override
    public void finalize(){
        System.out.println("finalize method overriden");
    }
}
