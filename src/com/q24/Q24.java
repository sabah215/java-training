package com.q24;

import com.q1.Employee;

public class Q24 {
    public static void m1(Employee e){
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        m1(emp);
    }
}

// Output: 101 sam 1000
