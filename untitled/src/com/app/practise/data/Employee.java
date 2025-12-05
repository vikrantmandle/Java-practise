package com.app.practise.data;

import java.util.Arrays;
import java.util.List;

public class Employee extends Person {
    private long id;
    private double salary;

    public Employee() {
    }

    public Employee(long id, String name, double salary) {
        super(name);
        this.id = id;
        this.salary = salary;
    }

    public static List<Employee> populateEmployee() {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "Harsh", 20000),
                new Employee(2, "Sadhana", 50000),
                new Employee(3, "Aarav", 60000),
                new Employee(4, "Justin", 70000),
                new Employee(5, "Ruhi", 45000));

        return employeeList;
    }

    public String getName() {
        return super.getName();
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', salary=" + salary + "}";
    }
}
