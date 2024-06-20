package io.designpatterns.gof.creational.builder.item.food;

public class Egg extends Food {

  @Override
  public String item() {
    return "Egg";
  }

  @Override
  public double price() {
    return 5;
  }
}
