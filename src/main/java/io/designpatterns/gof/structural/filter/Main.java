package io.designpatterns.gof.structural.filter;

import io.designpatterns.gof.structural.filter.emp.Department;
import io.designpatterns.gof.structural.filter.emp.Employee;
import io.designpatterns.gof.structural.filter.emp.Gender;
import io.designpatterns.gof.structural.filter.emp.Lang;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {


  public static void main(String[] args) {
    List<Employee> employees = produceEmployees(15);

    GenderFilter maleFilter = new GenderFilter(Gender.MALE);
    GenderFilter femaleFilter = new GenderFilter(Gender.FEMALE);

    DepartmentFilter ITFilter = new DepartmentFilter(Department.IT);
    DepartmentFilter marketingFilter = new DepartmentFilter(Department.MARKETING);

    AndFilter maleIT = new AndFilter(maleFilter, ITFilter);
    AndFilter femaleMarketing = new AndFilter(femaleFilter, marketingFilter);

    log.info("Male filters : ");
    List<Employee> maleList = maleFilter.filter(employees);
    for (Employee employee : maleList) {
      log.info("{}", employee);
    }

    log.info("Female filters : ");
    List<Employee> femaleList = femaleFilter.filter(employees);
    for (Employee employee : femaleList) {
      log.info("{}", employee);
    }

    log.info("IT filter : ");
    List<Employee> itList = ITFilter.filter(employees);
    for (Employee employee : itList) {
      log.info("{}", employee);
    }

    log.info("Male it filter : ");
    List<Employee> maleITList = maleIT.filter(employees);
    for (Employee employee : maleITList) {
      log.info("{}", employee);
    }

    log.info("Male marketing filter : ");
    List<Employee> maleMarketing = (new AndFilter(maleFilter, marketingFilter)).filter(employees);
    for (Employee employee : maleMarketing) {
      log.info("{}", employee);
    }

    log.info("Female or IT filter : ");
    List<Employee> femaleOrIT = (new OrFilter(femaleFilter, ITFilter)).filter(employees);
    for (Employee employee : femaleOrIT) {
      log.info("{}", employee);
    }

    log.info("Female && IT filter : ");
    List<Employee> femaleAndIT = (new AndFilter(femaleFilter, ITFilter)).filter(employees);
    for (Employee employee : femaleAndIT) {
      log.info("{}", employee);
    }


  }


  private static List<Employee> produceEmployees(int amount) {
    List<Employee> employees = new ArrayList<>();

    for (int i = 0; i < amount; i++) {
      Gender gender = Gender.MALE;
      Department department = Department.IT;
      Lang lang = Lang.GER;
      if (i % 2 == 0) {
        gender = Gender.FEMALE;
        department = Department.MARKETING;
        lang = Lang.ITA;
      }
      Employee newEmployee = new Employee(i, "Emp " + i, gender, 1000f, department, lang);
      employees.add(newEmployee);
    }
    return employees;
  }
}
