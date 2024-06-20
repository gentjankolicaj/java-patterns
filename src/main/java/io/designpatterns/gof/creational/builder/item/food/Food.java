package io.designpatterns.gof.creational.builder.item.food;

import io.designpatterns.gof.creational.builder.item.MealItem;
import io.designpatterns.gof.creational.builder.packing.Packing;
import io.designpatterns.gof.creational.builder.packing.Wrapper;

public abstract class Food implements MealItem {

  //Override this method with specific impl
  @Override
  public Packing packing() {
    return new Wrapper();
  }
}
