// File: src/model/Employee.java
package model;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String phone;
    private String email;

    public Employee() {}

    public Employee(int id, String name, String department, double salary, String phone, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + ", Phone=" + phone + ", Email=" + email + "]";
    }
}