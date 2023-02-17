package com.q34;

import com.q1.Employee;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        System.out.println("Enter Employee id name and salary");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        int salary = sc.nextInt();

        Employee emp = new Employee(id, name, salary);

        show(emp);
    }

    public static void show(Employee e){
        System.out.println(e.getId()+" "+e.getName()+" "+ e.getSalary());
    }
}
