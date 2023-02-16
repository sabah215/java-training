package com.q1;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sam", 1000);
//        Employee e2 = new Employee(102, "Jane", 1500);
//        e1.setId(101);
//        e1.setName("Sam");
//        e1.setSalary(1000);

        Main.show(emp);
        System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
    }

    public static void show(Employee e){
        System.out.println(e.getId() + " " + e.getName()+ " " + e.getSalary());
        e.setId(102);
    }

//    public static void show(Employee e){
//        System.out.println("Id: "+ e.getId() +
//                "\nName: "+ e.getName()+
//                "\nSalary: "+ e.getSalary());
//    }
}
