package io.designpatterns.gof.creational.factory;


import io.designpatterns.PatternException;

public class ShapeFactory {

  public ShapeFactory() {
    super();
  }

  public Shape produceShape(ShapeType shapeType) throws PatternException {
    if (shapeType == null) {
      throw new PatternException("ShapeType is null.Must be of a known type.");
    } else if (shapeType.equals(ShapeType.TRIANGLE)) {
      return new Triangle();
    } else if (shapeType.equals(ShapeType.RECTANGLE)) {
      return new Rectangle();
    } else if (shapeType.equals(ShapeType.SQUARE)) {
      return new Square();
    } else if (shapeType.equals(ShapeType.CIRCLE)) {
      return new Circle();
    } else {
      throw new PatternException("ShapeType is unimplemented.");
    }

  }


}
