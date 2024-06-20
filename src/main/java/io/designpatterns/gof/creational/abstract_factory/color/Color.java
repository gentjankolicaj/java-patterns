package io.designpatterns.gof.creational.abstract_factory.color;

import io.designpatterns.PatternException;


public interface Color {

  void paint() throws PatternException;

  default void defaultMethod() {
    System.err.println(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
  }
}
