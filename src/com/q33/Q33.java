package com.q33;

import com.q1.Employee;

public class Q33 {
    public static void show(Employee e){
        System.out.println(e.getId() +" "+e.getName()+" "+e.getSalary());
    }
    public static Employee process(Employee e){
        e.setId(101);
        e.setName("sam");
        e.setSalary(1000);
        return e;
    }
    public static void main(String[] args) {
        Employee e = new Employee(0,"", 0);
        process(e);
        show(e);
    }
}
