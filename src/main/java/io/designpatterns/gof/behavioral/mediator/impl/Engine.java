package io.designpatterns.gof.behavioral.mediator.impl;

import io.designpatterns.gof.behavioral.mediator.Component;
import io.designpatterns.gof.behavioral.mediator.Mediator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Engine implements Component<CarComponent> {

  @Override
  public CarComponent getKey() {
    return CarComponent.ENGINE;
  }

  @Override
  public <T> T getValue() {
    return null;
  }

  @Override
  public void setMediator(Mediator<CarComponent> mediator) {

  }


  public void run() {
    log.info("Running engine");
  }

  public void shutdown() {
    log.info("Shutdown engine");
  }
}
