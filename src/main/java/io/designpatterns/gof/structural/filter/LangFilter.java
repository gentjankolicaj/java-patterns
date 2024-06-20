package io.designpatterns.gof.structural.filter;

import io.designpatterns.PatternException;
import io.designpatterns.gof.structural.filter.emp.Employee;
import io.designpatterns.gof.structural.filter.emp.Lang;
import java.util.ArrayList;
import java.util.List;

public class LangFilter implements Filter {

  private final Lang lang;

  public LangFilter(Lang lang) {
    if (lang == null) {
      throw new PatternException("Lang can't be null");
    }
    this.lang = lang;
  }

  @Override
  public List<Employee> filter(List<Employee> employees) throws PatternException {
    if (employees == null) {
      throw new PatternException("Employee list can't be null.");
    }

    List<Employee> tmpList = new ArrayList<>();
    for (Employee emp : employees) {
      if (emp != null && lang.equals(emp.getLang())) {
        tmpList.add(emp);
      }
    }
    return tmpList;
  }

}
