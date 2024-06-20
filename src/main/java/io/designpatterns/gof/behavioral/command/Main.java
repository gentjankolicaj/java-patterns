package io.designpatterns.gof.behavioral.command;

import io.designpatterns.gof.behavioral.command.impl.AdjustVolumeCommand;
import io.designpatterns.gof.behavioral.command.impl.RemoteControl;
import io.designpatterns.gof.behavioral.command.impl.Stereo;
import io.designpatterns.gof.behavioral.command.impl.TV;
import io.designpatterns.gof.behavioral.command.impl.TurnOffCommand;
import io.designpatterns.gof.behavioral.command.impl.TurnOnCommand;

public class Main {

  public static void main(String[] args) {
    // Create receivers
    TV tv = new TV();
    Stereo stereo = new Stereo();

    // Create command objects
    Command turnOn = new TurnOnCommand(tv);
    Command turnOff = new TurnOffCommand(tv);
    Command adjustVolume = new AdjustVolumeCommand(stereo);

    //create invokers
    Invoker invoker = new RemoteControl();
    invoker.setCommand(turnOn);
    invoker.invoke();

    //set another command
    invoker.setCommand(adjustVolume);
    invoker.invoke();
  }

}
