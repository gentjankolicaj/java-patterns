package io.designpatterns.gof.structural.adapter.jet;

public class MIG35 implements Jet {

  @Override
  public String fly() {
    return "fly : " + this.getClass().getName();
  }

}
