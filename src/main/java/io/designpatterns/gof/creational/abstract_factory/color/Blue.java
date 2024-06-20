package io.designpatterns.gof.creational.abstract_factory.color;

import io.designpatterns.PatternException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Blue implements Color {

  @Override
  public void paint() throws PatternException {
    log.info("{} : paint() , hashCode : {}", getClass().getName(), hashCode());
  }


}
