package io.designpatterns.gof.creational.abstract_factory;

import io.designpatterns.gof.creational.abstract_factory.color.Color;
import io.designpatterns.gof.creational.abstract_factory.color.ColorType;
import io.designpatterns.gof.creational.abstract_factory.food.Food;
import io.designpatterns.gof.creational.abstract_factory.food.FoodType;
import io.designpatterns.gof.creational.abstract_factory.shape.FactoryType;
import io.designpatterns.gof.creational.abstract_factory.shape.Shape;
import io.designpatterns.gof.creational.abstract_factory.shape.ShapeType;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    //Create three factories
    AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR_FACTORY);
    AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE_FACTORY);
    AbstractFactory foodFactory = FactoryProducer.getFactory(FactoryType.FOOD_FACTORY);

    //Produce items using each factory
    List<Color> colors = new ArrayList<>();
    for (int i = 0; i < 1; i++) {
      colors.add(colorFactory.getColor(ColorType.RED));
      colors.add(colorFactory.getColor(ColorType.GREEN));
      colors.add(colorFactory.getColor(ColorType.BLUE));
    }

    List<Shape> shapes = new ArrayList<>();
    for (int i = 0; i < 1; i++) {
      shapes.add(shapeFactory.getShape(ShapeType.RECTANGLE));
      shapes.add(shapeFactory.getShape(ShapeType.TRIANGLE));
    }

    List<Food> foods = new ArrayList<>();
    for (int i = 0; i < 1; i++) {
      foods.add(foodFactory.getFood(FoodType.CAKE));
      foods.add(foodFactory.getFood(FoodType.HAMBURGER));
    }

    log.info("** ColorFactory items : ");
    for (Color color : colors) {
      color.paint();
      color.defaultMethod();
    }
    log.info("** ColorFactory items finished.");

    log.info("** ShapeFactory items : ");
    for (Shape shape : shapes) {
      shape.draw();
      shape.defaultMethod();
    }
    log.info("** ShapeFactory items finished.");

    log.info("** FoodFactory items : ");
    for (Food food : foods) {
      food.cook();
      food.defaultMethod();
    }
    log.info("** FoodFactory items finished.");


  }
}