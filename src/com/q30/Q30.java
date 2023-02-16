package com.q30;

import com.q1.Employee;

public class Q30 {
    public static Employee m1(){
        Employee e = new Employee(101, "sam", 1000);
        return e;

    }
    public static void main(String[] args) {
        Employee emp = m1();
        System.out.println(emp.getId() + " "+ emp.getName() +" "+ emp.getSalary());
    }
}

// Output: 101 sam 1000
