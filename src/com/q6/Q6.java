package com.q6;

import com.q1.Employee;

public class Q6 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        show(e);
    }

    public static void show(Employee e){
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
    }
}
