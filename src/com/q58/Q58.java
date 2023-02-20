package com.q58;

public class Q58 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee emp = new Employee(101,"John",1000);
        Employee emp2 = (Employee)emp.clone();

        System.out.println(emp2.getName());
    }
}
