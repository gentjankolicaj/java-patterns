package io.designpatterns.gof.creational.singleton;

import lombok.Getter;

public final class Driver {

  @Getter
  private static final Driver instance = new Driver();

  private Driver() {
  }

  public String getDetails() {
    return getClass().getName() + " : getDetails() , hashCode " + hashCode();
  }

}
