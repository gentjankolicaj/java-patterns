package io.designpatterns.gof.structural.bridge;

import io.designpatterns.gof.structural.bridge.color.Blue;
import io.designpatterns.gof.structural.bridge.color.Green;
import io.designpatterns.gof.structural.bridge.color.Red;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {

  public static void main(String[] args) {

    Circle redCircle = new Circle(1, 1, 1, new Red());
    Circle blueCircle = new Circle(2, 2, 2, new Blue());
    Circle greenCircle = new Circle(3, 3, 3, new Green());

    log.info(redCircle.draw());
    log.info(blueCircle.draw());
    log.info(greenCircle.draw());
  }

}
