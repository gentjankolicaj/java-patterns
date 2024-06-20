package io.designpatterns.gof.creational.abstract_factory.shape;

import io.designpatterns.PatternException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Shape {

  Logger LOGGER = LoggerFactory.getLogger(Shape.class);

  void draw() throws PatternException;

  default void defaultMethod() {
    LOGGER.error(getClass().getName() + " : defaultMethod() , hashCode : " + hashCode());
  }
}
