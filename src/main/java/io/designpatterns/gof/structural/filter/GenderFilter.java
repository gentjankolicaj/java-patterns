package io.designpatterns.gof.structural.filter;

import io.designpatterns.PatternException;
import io.designpatterns.gof.structural.filter.emp.Employee;
import io.designpatterns.gof.structural.filter.emp.Gender;
import java.util.ArrayList;
import java.util.List;

public class GenderFilter implements Filter {

  private final Gender gender;

  public GenderFilter(Gender gender) {
    if (gender == null) {
      throw new PatternException("Gender can't be null");
    }

    this.gender = gender;
  }

  @Override
  public List<Employee> filter(List<Employee> employees) throws PatternException {
    if (employees == null) {
      throw new PatternException("Employees list can't be null.");
    }

    List<Employee> tmpList = new ArrayList<>();
    for (Employee emp : employees) {
      if (emp != null && gender.equals(emp.getGender())) {
        tmpList.add(emp);
      }
    }
    return tmpList;
  }

}
