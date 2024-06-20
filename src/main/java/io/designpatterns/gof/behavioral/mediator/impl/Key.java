package io.designpatterns.gof.behavioral.mediator.impl;

import io.designpatterns.gof.behavioral.mediator.Component;
import io.designpatterns.gof.behavioral.mediator.Mediator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Key implements Component<CarComponent> {

  @Override
  public CarComponent getKey() {
    return CarComponent.KEY;
  }

  @Override
  public void setMediator(Mediator<CarComponent> mediator) {

  }

  @Override
  public byte[] getValue() {
    return null;
  }


  public void unlock() {
    log.info("Unlock car");
  }

  public void lock() {
    log.info("Lock car");
  }
}
