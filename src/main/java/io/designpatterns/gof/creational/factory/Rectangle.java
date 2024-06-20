package io.designpatterns.gof.creational.factory;

import io.designpatterns.PatternException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {

  @Override
  public void draw() throws PatternException {
    log.info("Object type : " + this + ",hashCode : " + hashCode());
  }


  public String toString() {
    return this.getClass().getCanonicalName();
  }
}
