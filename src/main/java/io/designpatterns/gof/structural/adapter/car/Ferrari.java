package io.designpatterns.gof.structural.adapter.car;

public class Ferrari implements Car {

  @Override
  public String move() {
    return "move:" + this.getClass().getName();
  }

}
