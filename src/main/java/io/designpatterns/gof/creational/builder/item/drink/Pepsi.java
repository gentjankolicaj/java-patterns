package io.designpatterns.gof.creational.builder.item.drink;

public class Pepsi extends Drink {

  @Override
  public String item() {
    return "Pepsi";
  }

  @Override
  public double price() {
    return 100;
  }
}
