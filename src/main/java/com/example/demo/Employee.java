package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
class Employee {

    @Id @GeneratedValue
    private long ID;
    private String firstName, lastName, Role;

    Employee(String firstName, String lastName, String Role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Role = Role;
    }



    public Employee() {

    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return firstName+" "+lastName;
    }

    public String getRole() {
        return Role;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {

        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];

    }

    public void setRole(String role) {
        this.Role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.ID, employee.ID) && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.Role, employee.Role);
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.ID, this.firstName, this.lastName, this.Role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.ID + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", role='" + this.Role + '\'' + '}';
    }
}

