package io.designpatterns.gof.behavioral.command;

public interface Invoker {

  void setCommand(Command command);

  void invoke();

}
