package io.designpatterns.gof.behavioral.chain.impl;

import io.designpatterns.gof.behavioral.chain.Request;
import java.nio.charset.Charset;

public class StringRequest implements Request {

  private final byte[] header;
  private final byte[] body;

  public StringRequest(String header, String body, Charset charset) {
    this.header = header.getBytes(charset);
    this.body = body.getBytes(charset);
  }

  @Override
  public byte[] getHeader() {
    return header;
  }

  @Override
  public byte[] getBody() {
    return body;
  }
}
