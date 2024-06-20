package io.designpatterns.gof.behavioral.command.impl;

import io.designpatterns.gof.behavioral.command.Command;
import java.util.Stack;

public class CommandHistory {

  private final Stack<Command> history = new Stack<>();

  public void push(Command command) {
    this.history.push(command);
  }

  public Command pop() {
    return this.history.pop();
  }

  public boolean isEmpty() {
    return history.isEmpty();
  }


}
