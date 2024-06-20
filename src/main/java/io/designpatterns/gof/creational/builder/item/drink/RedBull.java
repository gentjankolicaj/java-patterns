package io.designpatterns.gof.creational.builder.item.drink;

public class RedBull extends Drink {

  @Override
  public String item() {
    return "RedBull";
  }

  @Override
  public double price() {
    return 150;
  }
}
