package io.designpatterns.gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public final class FoodCache {

  private static final Map<Integer, Food> foodMap = new HashMap<>();


  private FoodCache() {
  }

  public static void loadCache() {
    for (int i = 0; i < 10; i++) {
      foodMap.put(Integer.valueOf(3 * i), new Cake(i));
      foodMap.put(Integer.valueOf(3 * i + 1), new Pica(i));
      foodMap.put(Integer.valueOf(3 * i + 2), new Taco(i));
    }

  }

  public static Food getFood(Integer foodId) {
    Food oldFood = foodMap.get(foodId);

    try {
      return oldFood.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      cloneNotSupportedException.printStackTrace();
      return null;
    }
  }

}
