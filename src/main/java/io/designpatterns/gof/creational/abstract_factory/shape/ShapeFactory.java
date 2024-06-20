package io.designpatterns.gof.creational.abstract_factory.shape;

import io.designpatterns.PatternException;
import io.designpatterns.gof.creational.abstract_factory.AbstractFactory;
import io.designpatterns.gof.creational.abstract_factory.color.Color;
import io.designpatterns.gof.creational.abstract_factory.color.ColorType;
import io.designpatterns.gof.creational.abstract_factory.food.Food;
import io.designpatterns.gof.creational.abstract_factory.food.FoodType;

public class ShapeFactory extends AbstractFactory {

  @Override
  public Color getColor(ColorType colorType) throws PatternException {
    throw new PatternException("ShapeFactory doesn't produce color.");
  }

  @Override
  public Food getFood(FoodType foodType) {
    throw new PatternException("ShapeFactory doesn't produce food.");
  }

  @Override
  public Shape getShape(ShapeType shapeType) throws PatternException {
    if (shapeType == null) {
      throw new PatternException("Shape type is null.Must be of known type.");
    } else if (shapeType.equals(ShapeType.TRIANGLE)) {
      return new Triangle();
    } else if (shapeType.equals(ShapeType.RECTANGLE)) {
      return new Rectangle();
    } else {
      throw new PatternException("Shape type is unimplemented.");
    }
  }

}
