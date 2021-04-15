package com.codecool.employee;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private String birthDate;

    public Employee(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && birthDate.equals(employee.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }
}
