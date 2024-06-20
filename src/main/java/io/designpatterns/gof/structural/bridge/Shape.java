package io.designpatterns.gof.structural.bridge;


import io.designpatterns.gof.structural.bridge.color.Color;

public abstract class Shape {

  protected Color color;

  protected Shape(Color color) {
    this.color = color;
  }

  protected abstract String draw();
}
