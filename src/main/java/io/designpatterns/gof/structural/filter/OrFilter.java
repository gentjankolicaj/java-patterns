package io.designpatterns.gof.structural.filter;

import io.designpatterns.PatternException;
import io.designpatterns.gof.structural.filter.emp.Employee;
import java.util.List;

public class OrFilter implements Filter {

  private final Filter filterOne;
  private final Filter filterTwo;

  public OrFilter(Filter filterOne, Filter filterTwo) {
    this.filterOne = filterOne;
    this.filterTwo = filterTwo;
  }


  @Override
  public List<Employee> filter(List<Employee> employees) throws PatternException {
    if (employees == null) {
      throw new PatternException("Employees list can't be null");
    }

    List<Employee> firstFiltratedEmployees = filterOne.filter(employees);
    List<Employee> secondFiltratedEmployees = filterTwo.filter(employees);
    if (firstFiltratedEmployees == null && secondFiltratedEmployees == null) {
      throw new PatternException("No employee passed first & second filter");
    } else if (firstFiltratedEmployees == null) {
      return secondFiltratedEmployees;
    } else if (secondFiltratedEmployees == null) {
      return firstFiltratedEmployees;
    } else {
      for (int i = 0; i < firstFiltratedEmployees.size(); i++) {
        Employee tmpEmployee = firstFiltratedEmployees.get(i);
        if (!secondFiltratedEmployees.contains(tmpEmployee)) {
          secondFiltratedEmployees.add(tmpEmployee);
        }
      }
      return secondFiltratedEmployees;
    }


  }
}
