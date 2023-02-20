package com.q7;

import com.q1.Employee;

public class Q7 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "sam", 1000);
        Employee e1 = new Employee(102, "John", 1500);
        show(e);
        show(e1);
    }

    public static void show(Employee e){
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
    }
}
