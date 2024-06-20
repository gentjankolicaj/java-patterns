package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.HandleException;
import io.designpatterns.gof.behavioral.chain.Handler;
import io.designpatterns.gof.behavioral.chain.Request;
import java.util.Objects;

public class NonEmptyHandler implements Handler {

  private Handler next;

  @Override
  public void handle(Request request) {
    //check if header is null
    if (Objects.isNull(request.getHeader())) {
      throw new HandleException("Header request is null.");
    }

    //check if request body is null
    if (Objects.isNull(request.getBody())) {
      throw new HandleException("Body request is null.");
    }

    //if previous checks are passed, proceed to next handler
    if (Objects.nonNull(next)) {
      next.handle(request);
    }
  }

  @Override
  public void next(Handler handler) {
    this.next = handler;
  }
}
