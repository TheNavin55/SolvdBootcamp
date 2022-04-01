package com.solvd.staff;

import com.solvd.enums.Gender;
import com.solvd.generalpurpose.Person;

import java.time.LocalDate;

public abstract class Employee extends Person {
    private int id;
    private LocalDate startDate;
    private double salary;

    public Employee() {
        this.id = id;
        this.startDate = startDate;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int id, LocalDate startDate, double salary) {
        super(firstName, lastName);
        this.id = id;
        this.startDate = startDate;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, LocalDate birthDate, Gender gender, int id, LocalDate startDate, double salary) {
        super(firstName, lastName, birthDate, gender);
        this.id = id;
        this.startDate = startDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
