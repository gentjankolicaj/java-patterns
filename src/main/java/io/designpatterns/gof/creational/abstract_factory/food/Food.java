package io.designpatterns.gof.creational.abstract_factory.food;

import io.designpatterns.PatternException;


public interface Food {


  void cook() throws PatternException;


  default void defaultMethod() {
    System.err.println(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
  }
}
