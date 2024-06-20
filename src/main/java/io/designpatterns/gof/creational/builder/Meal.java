package io.designpatterns.gof.creational.builder;

import io.designpatterns.gof.creational.builder.item.MealItem;
import java.util.ArrayList;
import java.util.List;

public class Meal {

  private final List<MealItem> mealItems;

  public Meal() {
    super();
    this.mealItems = new ArrayList<>();
  }

  public Meal(int itemsNumber) {
    super();
    this.mealItems = new ArrayList<>(itemsNumber);
  }

  public void setItem(MealItem mealItem) {
    mealItems.add(mealItem);
  }

  public double getCost() {
    double cost = 0.0;
    for (MealItem mealItem : mealItems) {
      cost = cost + mealItem.price();
    }
    return cost;
  }

  public String[] getIngredients() {
    String[] ingredients = new String[mealItems.size()];
    for (int i = 0; i < ingredients.length; i++) {
      ingredients[i] = mealItems.get(i).item();
    }
    return ingredients;
  }

}
