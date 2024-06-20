package io.designpatterns.gof.behavioral.command.impl;

import io.designpatterns.gof.behavioral.command.Command;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AdjustVolumeCommand implements Command {

  private final Stereo stereo;

  @Override
  public void execute() {
    log.info("AdjustVolume");
    stereo.action();
  }

}
