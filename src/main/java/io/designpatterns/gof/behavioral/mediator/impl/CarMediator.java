package io.designpatterns.gof.behavioral.mediator.impl;

import io.designpatterns.gof.behavioral.mediator.Component;
import io.designpatterns.gof.behavioral.mediator.Mediator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


public class CarMediator implements Mediator<CarComponent> {

  private final Map<CarComponent, Component<CarComponent>> components = new ConcurrentHashMap<>();

  @Override
  public Map<CarComponent, Component<CarComponent>> getComponents() {
    return this.components;
  }

  @Override
  public Component<CarComponent> put(CarComponent key, Component<CarComponent> value) {
    return components.put(key, value);
  }

  @Override
  public Component<CarComponent> remove(Component<CarComponent> value) {
    return null;
  }

  @Override
  public Component<CarComponent> remove(CarComponent key, Component<CarComponent> value) {
    return null;
  }

  @Override
  public Optional<Component<CarComponent>> getValue(CarComponent key) {
    return Optional.of(components.get(key));
  }


  public void startCar() {
    Component<CarComponent> keyComp = components.get(CarComponent.KEY);
    if (keyComp != null) {
      ((Key) keyComp).unlock();
    }

    Component<CarComponent> engineComp = components.get(CarComponent.ENGINE);
    if (engineComp != null) {
      ((Engine) engineComp).run();
    }
  }

  public void stopCar() {
    Component<CarComponent> engineComp = components.get(CarComponent.ENGINE);
    if (engineComp != null) {
      ((Engine) engineComp).shutdown();
    }

    Component<CarComponent> keyComp = components.get(CarComponent.KEY);
    if (keyComp != null) {
      ((Key) keyComp).lock();
    }
  }

}
