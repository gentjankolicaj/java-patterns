package io.designpatterns.gof.creational.builder.item.food;

public class Hamburger extends Food {

  @Override
  public String item() {
    return "Hamburger";
  }

  @Override
  public double price() {
    return 80;
  }
}
