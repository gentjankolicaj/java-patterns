package io.designpatterns.gof.creational.abstract_factory;

import io.designpatterns.PatternException;
import io.designpatterns.gof.creational.abstract_factory.color.ColorFactory;
import io.designpatterns.gof.creational.abstract_factory.food.FoodFactory;
import io.designpatterns.gof.creational.abstract_factory.shape.FactoryType;
import io.designpatterns.gof.creational.abstract_factory.shape.ShapeFactory;

public class FactoryProducer {

  public static AbstractFactory getFactory(FactoryType factoryType) throws PatternException {
    if (factoryType == null) {
      throw new PatternException("FactoryType is null.Must be of known type.");
    } else if (factoryType.equals(FactoryType.COLOR_FACTORY)) {
      return new ColorFactory();
    } else if (factoryType.equals(FactoryType.FOOD_FACTORY)) {
      return new FoodFactory();
    } else if (factoryType.equals(FactoryType.SHAPE_FACTORY)) {
      return new ShapeFactory();
    } else {
      throw new PatternException("Factory type is unimplemented.");
    }
  }
}
