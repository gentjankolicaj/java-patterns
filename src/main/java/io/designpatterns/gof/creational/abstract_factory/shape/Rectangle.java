package io.designpatterns.gof.creational.abstract_factory.shape;

import io.designpatterns.PatternException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {

  @Override
  public void draw() throws PatternException {
    log.info("{} : draw() , hashCode : {}", getClass().getName(), hashCode());
  }

  @Override
  public void defaultMethod() {
    Shape.super.defaultMethod();
    log.debug("{} : defaultMethod() , hashCode : {}", getClass().getName(), hashCode());

  }
}
