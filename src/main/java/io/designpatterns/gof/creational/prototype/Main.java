package io.designpatterns.gof.creational.prototype;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    //load cache objects on heap hash-map
    FoodCache.loadCache();

    //Get different foods
    Food food1 = FoodCache.getFood(1);
    Food food0 = FoodCache.getFood(0);

    Food food13 = FoodCache.getFood(13);
    Food food17 = FoodCache.getFood(17);

    log.info("Details : ");
    log.info(Arrays.toString(food0.details()));
    log.info(Arrays.toString(food1.details()));
    log.info(Arrays.toString(food13.details()));
    log.info(Arrays.toString(food17.details()));

  }
}
