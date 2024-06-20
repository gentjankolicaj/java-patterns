package io.designpatterns.gof.structural.adapter;

import io.designpatterns.gof.structural.adapter.car.Car;

public class CarAdapter implements Machine {

  Car car;

  public CarAdapter(Car car) {
    this.car = car;
  }

  @Override
  public String operate() {
    return "Operate -> " + car.move();
  }
}
