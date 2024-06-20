package io.designpatterns.gof.structural.filter.emp;

import java.util.Objects;

public class Employee {

  private int id;
  private String name;
  private Gender gender;
  private float salary;
  private Department department;
  private Lang lang;

  public Employee(int id, String name, Gender gender, float salary, Department department,
      Lang lang) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.salary = salary;
    this.department = department;
    this.lang = lang;
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

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Lang getLang() {
    return lang;
  }

  public void setLang(Lang lang) {
    this.lang = lang;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee)) {
      return false;
    }
    Employee employee = (Employee) o;
    return getId() == employee.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", gender=" + gender +
        ", salary=" + salary +
        ", department=" + department +
        ", lang=" + lang +
        '}';
  }
}
