package io.designpatterns.gof.creational.builder.item.drink;

public class Tea extends Drink {

  @Override
  public String item() {
    return "Tea";
  }

  @Override
  public double price() {
    return 40;
  }
}
