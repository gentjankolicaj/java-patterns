package io.designpatterns.gof.behavioral.chain;

import io.designpatterns.gof.behavioral.chain.impl.CredentialHandler;
import io.designpatterns.gof.behavioral.chain.impl.HandlerContext;
import io.designpatterns.gof.behavioral.chain.impl.NonEmptyHandler;
import io.designpatterns.gof.behavioral.chain.impl.RoleHandler;
import io.designpatterns.gof.behavioral.chain.impl.StringRequest;
import io.designpatterns.gof.behavioral.chain.impl.ThrottleHandler;
import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    //handler declaration
    Handler throttleHandler = new ThrottleHandler(1000);
    Handler emptyHandler = new NonEmptyHandler();
    Handler credentialHandler = new CredentialHandler();
    Handler roleHandler = new RoleHandler();

    Request simpleRequest = new StringRequest("GET", "{username:\"user\",password:\"pwd\"}",
        Charset.defaultCharset());

    //link handler chain
    Handler handler = HandlerContext.linkChain(throttleHandler, emptyHandler, credentialHandler,
        roleHandler);

    //handle request
    handler.handle(simpleRequest);
  }

}
