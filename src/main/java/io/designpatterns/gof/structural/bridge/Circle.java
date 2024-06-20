package io.designpatterns.gof.structural.bridge;

import io.designpatterns.gof.structural.bridge.color.Color;

public class Circle extends Shape {

  protected int x;
  protected int y;
  protected int radius;

  public Circle(int x, int y, int radius, Color color) {
    super(color);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  protected String draw() {
    return color.getColor() + " x,y : " + x + y + ", radius : " + radius;
  }
}
