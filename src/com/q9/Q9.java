package com.q9;

import com.q1.Employee;

public class Q9 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sam", 1000);
        Q9.show(emp);
        emp.setSalary(emp.getSalary() + 100);
        Q9.show(emp);
    }
    public static void show(Employee e){
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
    }
}
