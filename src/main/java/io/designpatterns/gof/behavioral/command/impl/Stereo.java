package io.designpatterns.gof.behavioral.command.impl;

import io.designpatterns.gof.behavioral.command.Receiver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stereo implements Receiver {

  @Override
  public void action() {
    log.info("Stereo: action()");
  }
}
