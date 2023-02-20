package com.q57;

public class Q57 {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "John", 1500);
        Employee e2 = new Employee(101, "Jane", 2000);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

    }
}
