package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.Handler;
import io.designpatterns.gof.behavioral.chain.Request;

public class BodyHandler implements Handler {

  @Override
  public void handle(Request request) {
    //impl
  }

  @Override
  public void next(Handler handler) {
    //impl
  }
}
