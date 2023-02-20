package com.q56;

import com.q53.Product;

public class Q56 {
    public static void main(String[] args) {
        Product p1 = new Product(111,"Apple", 1.55, 5);
        Product p2 = new Product(112, "Tangerine", 2.5,5);

        // Compared based on product quantity
        System.out.println(p1.equals(p2));
    }
}
