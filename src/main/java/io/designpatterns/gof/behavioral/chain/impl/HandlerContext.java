package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.Handler;
import org.apache.commons.lang3.ArrayUtils;

public final class HandlerContext {


  private HandlerContext() {
  }


  public static Handler linkChain(Handler... handlers) {
    if (ArrayUtils.isEmpty(handlers)) {
      throw new IllegalArgumentException("Can't link a chain of empty handlers");
    }
    //chain handlers
    for (int i = 0, len = handlers.length - 1; i < len; i++) {
      handlers[i].next(handlers[i + 1]);
    }
    return handlers[0];
  }

}
