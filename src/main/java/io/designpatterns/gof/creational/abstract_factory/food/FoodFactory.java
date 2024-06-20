package io.designpatterns.gof.creational.abstract_factory.food;

import io.designpatterns.PatternException;
import io.designpatterns.gof.creational.abstract_factory.AbstractFactory;
import io.designpatterns.gof.creational.abstract_factory.color.Color;
import io.designpatterns.gof.creational.abstract_factory.color.ColorType;
import io.designpatterns.gof.creational.abstract_factory.shape.Shape;
import io.designpatterns.gof.creational.abstract_factory.shape.ShapeType;

public class FoodFactory extends AbstractFactory {

  @Override
  public Color getColor(ColorType colorType) throws PatternException {
    throw new PatternException("FoodFactory doesn't produce color.");
  }

  @Override
  public Food getFood(FoodType foodType) throws PatternException {
    if (foodType == null) {
      throw new PatternException("FoodType is null.Must be of known type.");
    } else if (foodType.equals(FoodType.CAKE)) {
      return new Cake();
    } else if (foodType.equals(FoodType.HAMBURGER)) {
      return new Hamburger();
    } else {
      throw new PatternException("FoodType is unimplemented.");
    }
  }

  @Override
  public Shape getShape(ShapeType shapeType) throws PatternException {
    return null;
  }
}
