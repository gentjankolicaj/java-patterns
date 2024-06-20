package io.designpatterns.gof.behavioral.command.impl;

import io.designpatterns.gof.behavioral.command.Command;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TurnOnCommand implements Command {

  private final TV tv;

  @Override
  public void execute() {
    log.info("TurnOn");
    tv.action();
  }

}
