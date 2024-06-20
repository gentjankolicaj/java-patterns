package io.designpatterns.gof.structural.adapter;

import io.designpatterns.gof.structural.adapter.jet.Jet;

public class JetAdapter implements Machine {

  Jet jet;

  public JetAdapter(Jet jet) {
    this.jet = jet;
  }

  @Override
  public String operate() {
    return "Operate -> " + jet.fly();
  }
}
