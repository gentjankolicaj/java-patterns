package io.designpatterns.gof.structural.adapter.car;

public class Mercedes implements Car {

  @Override
  public String move() {
    return "move:" + this.getClass().getName();
  }

}
