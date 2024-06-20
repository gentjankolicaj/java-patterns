package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.Handler;
import io.designpatterns.gof.behavioral.chain.Request;

public final class ThrottleHandler implements Handler {

  private static final long minuteToMillis = 60_000;
  public int requestPerMinute;
  private Handler next;
  private int requestNumber;
  private long startTime;

  public ThrottleHandler(int requestPerMinute) {
    this.requestPerMinute = requestPerMinute;
    this.startTime = System.currentTimeMillis();
  }

  @Override
  public void handle(Request request) {
    //if one minute has passed,reset requests & startTime
    if (System.currentTimeMillis() > startTime + minuteToMillis) {
      requestNumber = 0;
      startTime = System.currentTimeMillis();
    }
    //else count request as new
    requestNumber++;

    //if max request number reached stop thread
    if (requestNumber > requestPerMinute) {
      Thread.currentThread().interrupt();
    }

    //call next handler
    if (next != null) {
      next.handle(request);
    }
  }

  @Override
  public void next(Handler handler) {
    this.next = handler;
  }

}
