package io.designpatterns.gof.behavioral.mediator.impl;

import io.designpatterns.gof.behavioral.mediator.Component;
import io.designpatterns.gof.behavioral.mediator.Mediator;


public class Door implements Component<CarComponent> {

  @Override
  public CarComponent getKey() {
    return CarComponent.DOOR;
  }

  @Override
  public <T> T getValue() {
    return null;
  }

  @Override
  public void setMediator(Mediator<CarComponent> mediator) {

  }


}
