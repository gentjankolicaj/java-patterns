package io.designpatterns.gof.creational.builder.item.drink;

import io.designpatterns.gof.creational.builder.item.MealItem;
import io.designpatterns.gof.creational.builder.packing.Bottle;
import io.designpatterns.gof.creational.builder.packing.Packing;

public abstract class Drink implements MealItem {


  //Override this method with specific Packing impl
  @Override
  public Packing packing() {
    return new Bottle();
  }

}
