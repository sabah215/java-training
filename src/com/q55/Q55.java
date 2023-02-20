package com.q55;

import com.q1.Employee;

public class Q55 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101,"John", 1000);
        Employee emp2 = new Employee(101,"Jane", 1000);

        // Compared based on employee salary data
        System.out.println(emp1.equals(emp2));
    }
}
