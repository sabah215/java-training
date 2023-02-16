package com.q12;

public class Q12 {
    private static int total = 10;

    // 4th way
    static {
        System.out.println(total);
    }

    public static void main(String[] args) {
        // 1st way
        System.out.println(total);

        // 2nd way
        System.out.println(Q12.total);

        // 3rd way
        System.out.println(getTotal());
    }

    public static int getTotal() {
        return total;
    }
}
