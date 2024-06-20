package io.designpatterns.gof.creational.abstract_factory.food;

import io.designpatterns.PatternException;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Cake implements Food {

  @Override
  public void cook() throws PatternException {
    log.info("{} : cook() , hashCode : {}", getClass().getName(), hashCode());
  }


}
