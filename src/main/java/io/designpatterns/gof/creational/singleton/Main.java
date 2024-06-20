package io.designpatterns.gof.creational.singleton;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {

  public static void main(String[] args) {
    Driver driver = Driver.getInstance();

    String driverDetails = driver.getDetails();
    log.info(driverDetails);
  }

}
