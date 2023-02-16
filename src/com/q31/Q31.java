package com.q31;

import com.q1.Employee;

public class Q31 {
    public static Object m1(){
        Employee emp = new Employee(101, "sam", 1000);
        return emp;
    }
    public static void main(String[] args) {
        Employee e = (Employee) m1();
        System.out.println(e.getId()+" "+e.getName() + " "+ e.getSalary());
    }
}
