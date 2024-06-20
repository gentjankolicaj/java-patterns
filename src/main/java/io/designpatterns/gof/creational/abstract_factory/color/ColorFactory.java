package io.designpatterns.gof.creational.abstract_factory.color;

import io.designpatterns.PatternException;
import io.designpatterns.gof.creational.abstract_factory.AbstractFactory;
import io.designpatterns.gof.creational.abstract_factory.food.Food;
import io.designpatterns.gof.creational.abstract_factory.food.FoodType;
import io.designpatterns.gof.creational.abstract_factory.shape.Shape;
import io.designpatterns.gof.creational.abstract_factory.shape.ShapeType;

public class ColorFactory extends AbstractFactory {

  @Override
  public Color getColor(ColorType colorType) throws PatternException {
    if (colorType == null) {
      throw new PatternException("ColorType is null.Must be of known type.");
    }
    if (colorType.equals(ColorType.RED)) {
      return new Red();
    } else if (colorType.equals(ColorType.BLUE)) {
      return new Blue();
    } else if (colorType.equals(ColorType.GREEN)) {
      return new Green();
    } else {
      throw new PatternException("Color type is unimplemented");
    }
  }

  @Override
  public Food getFood(FoodType foodType) throws PatternException {
    throw new PatternException("ColorFactory doesn't produce food.");
  }

  @Override
  public Shape getShape(ShapeType shapeType) throws PatternException {
    throw new PatternException("ColorFactory doesn't produce shape.");
  }
}
