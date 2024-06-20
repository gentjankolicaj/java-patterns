package io.designpatterns.gof.behavioral.mediator;


import io.designpatterns.gof.behavioral.mediator.impl.CarComponent;
import io.designpatterns.gof.behavioral.mediator.impl.CarMediator;
import io.designpatterns.gof.behavioral.mediator.impl.Door;
import io.designpatterns.gof.behavioral.mediator.impl.Engine;
import io.designpatterns.gof.behavioral.mediator.impl.Key;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    CarMediator mediator = new CarMediator();

    //create component instances
    Component<CarComponent> carKey = new Key();
    Component<CarComponent> carDoor = new Door();
    Component<CarComponent> carEngine = new Engine();

    //Put components at mediator
    mediator.put(carKey.getKey(), carKey);
    mediator.put(carDoor.getKey(), carDoor);
    mediator.put(carEngine.getKey(), carEngine);

    //start car
    mediator.startCar();

    //mediator stop car
    mediator.stopCar();
  }

}
