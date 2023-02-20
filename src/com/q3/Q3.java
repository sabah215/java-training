package com.q3;

import com.q1.Employee;

public class Q3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("sam");
        e.setSalary(1000);
        System.out.println(e.getId()+ " " +e.getName()+" "+e.getSalary());
    }
}
