package com.q21;

import com.q1.Employee;

public class Q21 {
    public static void m1(Employee e){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        m1(emp);
    }
}

// Output: m1 method
