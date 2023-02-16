package com.q25;

import com.q1.Employee;

public class Q25 {

    public static void m1(Object o){
        Employee e = (Employee) o;
        System.out.println(e.getId() + " "+ e.getName()+" "+e.getSalary());
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        m1(emp);
    }
}
// Output: 101 sam 1000