package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.HandleException;
import io.designpatterns.gof.behavioral.chain.Handler;
import io.designpatterns.gof.behavioral.chain.Request;

@SuppressWarnings("all")
public class RoleHandler implements Handler {

  private Handler next;

  @Override
  public void handle(Request request) {
    //if role not present throw exception because can't access resources
    if (!hasRole(request)) {
      throw new HandleException("Request can't proceed because doesn't have role.");
    }
    //else if role present proceed to next handler
    if (next != null) {
      next.handle(request);
    }
  }

  @Override
  public void next(Handler handler) {
    this.next = handler;
  }

  /**
   * Implement validation if request has role
   *
   * @param request raw request object
   * @return boolean
   */
  private boolean hasRole(Request request) {
    return request == null;
  }
}
