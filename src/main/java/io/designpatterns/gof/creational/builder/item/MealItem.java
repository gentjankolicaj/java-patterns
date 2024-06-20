package io.designpatterns.gof.creational.builder.item;

import io.designpatterns.gof.creational.builder.packing.Packing;

public interface MealItem {

  String item();

  Packing packing();

  double price();

}
