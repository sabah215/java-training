package com.q26;

import com.q1.Employee;

public class Q26 {
    public static void m1(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        m1(emp.getId());
    }
}

// Output: 101
