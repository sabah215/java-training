package com.q1;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Id: " + getId() + " Name: " + getName()+" Salary: " + getSalary();
    }

    @Override
    public boolean equals(Object o){
        Employee e = (Employee) o;
        return this.getSalary() == e.getSalary();
    }
}
