package com.q4;

import com.q1.Employee;

public class Q4 {
    public static void main(String[] args) {
        Employee e = new Employee(101,"sam",1000);
        System.out.println(e.getId()+ " " +e.getName()+" "+e.getSalary());
    }
}
