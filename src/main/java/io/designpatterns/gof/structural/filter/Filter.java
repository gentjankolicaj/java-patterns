package io.designpatterns.gof.structural.filter;

import io.designpatterns.PatternException;
import io.designpatterns.gof.structural.filter.emp.Employee;
import java.util.List;

public interface Filter {

  List<Employee> filter(List<Employee> employees) throws PatternException;

}
