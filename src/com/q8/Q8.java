package com.q8;

import com.q1.Employee;

public class Q8 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        Q8.show(emp);
        System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSalary());
    }

    public static void show(Employee ex) {
        System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSalary());
        ex.setId(102);
    }

}

//Output: 101 sam 1000
//        102 sam 1000
