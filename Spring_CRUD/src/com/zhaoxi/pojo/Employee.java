package com.zhaoxi.pojo;

/**
 * @author shkstart
 * @create2021-01-2110:45
 */
public class Employee {
    //员工id
    private Integer id;
    //员工名字
    private String lastName;
    //员工性别
    private Integer gender;
    //员工email
    private String email;
    //员工部门
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String lastName, Integer gender, String email, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", department=" + department +
                '}';
    }
}
