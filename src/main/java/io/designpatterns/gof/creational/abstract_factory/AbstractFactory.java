package io.designpatterns.gof.creational.abstract_factory;

import io.designpatterns.PatternException;
import io.designpatterns.gof.creational.abstract_factory.color.Color;
import io.designpatterns.gof.creational.abstract_factory.color.ColorType;
import io.designpatterns.gof.creational.abstract_factory.food.Food;
import io.designpatterns.gof.creational.abstract_factory.food.FoodType;
import io.designpatterns.gof.creational.abstract_factory.shape.Shape;
import io.designpatterns.gof.creational.abstract_factory.shape.ShapeType;

public abstract class AbstractFactory {

  public abstract Color getColor(ColorType colorType) throws PatternException;

  public abstract Food getFood(FoodType foodType) throws PatternException;

  public abstract Shape getShape(ShapeType shapeType) throws PatternException;

}
