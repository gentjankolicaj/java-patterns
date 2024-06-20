package io.designpatterns.gof.creational.builder;

import io.designpatterns.gof.creational.builder.item.MealItem;

public interface MealBuilder {

  MealBuilder addItem(MealItem mealItem);

  Meal build();

}
