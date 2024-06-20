package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.HandleException;
import io.designpatterns.gof.behavioral.chain.Handler;
import io.designpatterns.gof.behavioral.chain.Request;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class CredentialHandler implements Handler {

  private Handler next;

  @Override
  public void handle(Request request) {
    //check if request can't authenticate
    if (!authenticate(request)) {
      throw new HandleException("Request credentials not valid.");
    }

    //if authenticated proceed to next handler
    if (next != null) {
      next.handle(request);
    }
  }

  @Override
  public void next(Handler handler) {
    this.next = handler;
  }

  public boolean authenticate(Request request) {
    if (Objects.isNull(request) || Objects.isNull(request.getBody())) {
      return false;
    }
    String username = parseUsername(request.getBody());
    String password = parsePassword(request.getBody());
    //dao check here
    return StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password);
  }

  private String parseUsername(byte[] body) {
    return new String(body, Charset.defaultCharset());
  }

  private String parsePassword(byte[] body) {
    return new String(body, Charset.defaultCharset());
  }
}
