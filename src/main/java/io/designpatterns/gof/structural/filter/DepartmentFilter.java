package io.designpatterns.gof.structural.filter;

import io.designpatterns.PatternException;
import io.designpatterns.gof.structural.filter.emp.Department;
import io.designpatterns.gof.structural.filter.emp.Employee;
import java.util.ArrayList;
import java.util.List;

public class DepartmentFilter implements Filter {

  private final Department department;

  public DepartmentFilter(Department department) {
    if (department == null) {
      throw new PatternException("Department can't be null");
    }
    this.department = department;
  }

  @Override
  public List<Employee> filter(List<Employee> employees) throws PatternException {
    if (employees == null) {
      throw new PatternException("Employee list can't be null.");
    }
    List<Employee> tmpList = new ArrayList<>();
    for (Employee emp : employees) {
      if (emp != null && department.equals(emp.getDepartment())) {
        tmpList.add(emp);
      }
    }
    return tmpList;
  }
}
