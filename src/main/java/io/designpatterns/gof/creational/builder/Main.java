package io.designpatterns.gof.creational.builder;

import io.designpatterns.gof.creational.builder.item.drink.RedBull;
import io.designpatterns.gof.creational.builder.item.drink.Tea;
import io.designpatterns.gof.creational.builder.item.food.Cookie;
import io.designpatterns.gof.creational.builder.item.food.Egg;
import io.designpatterns.gof.creational.builder.item.food.Hamburger;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {

    MealBuilder mealBuilder = new MealBuilderImpl();

    Meal breakfast = mealBuilder.addItem(new Tea())
        .addItem(new Egg())
        .addItem(new Cookie())
        .build();

    Meal lunch = mealBuilder.addItem(new Egg())
        .addItem(new Hamburger())
        .addItem(new RedBull())
        .build();

    log.warn("Breakfast meal : ");
    log.info("Costs {}, ingredients : {}", breakfast.getCost(),
        Arrays.toString(breakfast.getIngredients()));

    log.warn("Lunch meal : ");
    log.info("Costs {}, ingredients : {}", lunch.getCost(),
        Arrays.toString(lunch.getIngredients()));
  }
}
