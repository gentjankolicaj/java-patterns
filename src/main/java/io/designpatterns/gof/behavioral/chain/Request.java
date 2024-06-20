package io.designpatterns.gof.behavioral.chain;

public interface Request {


  byte[] getHeader();

  byte[] getBody();

}
