package io.designpatterns.gof.behavioral.command.impl;

import io.designpatterns.gof.behavioral.command.Command;
import io.designpatterns.gof.behavioral.command.Invoker;
import lombok.Setter;


public class RemoteControl implements Invoker {

  @Setter
  private Command command;

  @Override
  public void invoke() {
    this.command.execute();
  }
}
