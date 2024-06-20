package io.designpatterns.gof.behavioral.mediator.impl;

import io.designpatterns.gof.behavioral.mediator.Component;
import io.designpatterns.gof.behavioral.mediator.Mediator;

public class GasPedal implements Component<CarComponent> {

  @Override
  public CarComponent getKey() {
    return CarComponent.GAS_PEDAL;
  }

  @Override
  public <T> T getValue() {
    return null;
  }

  @Override
  public void setMediator(Mediator<CarComponent> mediator) {

  }


}
