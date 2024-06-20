package io.designpatterns.gof.creational.factory;

import io.designpatterns.PatternException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle implements Shape {


  @Override
  public void draw() throws PatternException {
    log.info("Object type : {},hashCode : {}", this, hashCode());
  }


  public String toString() {
    return this.getClass().getCanonicalName();
  }
}
