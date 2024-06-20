package io.designpatterns.gof.creational.builder;

import io.designpatterns.gof.creational.builder.item.MealItem;

public class MealBuilderImpl implements MealBuilder {

  private Meal meal;

  public MealBuilderImpl() {
    super();
  }

  @Override
  public MealBuilder addItem(MealItem mealItem) {
    if (meal == null) {
      meal = new Meal();
    }

    meal.setItem(mealItem);
    return this;
  }


  @Override
  public Meal build() {
    Meal oldMeal = this.meal;

    //New instance for upcoming new meal
    this.meal = new Meal();
    return oldMeal;
  }
}
