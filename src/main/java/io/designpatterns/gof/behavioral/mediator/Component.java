package io.designpatterns.gof.behavioral.mediator;

public interface Component<K> {

  K getKey();

  <T> T getValue();

  void setMediator(Mediator<K> mediator);
}
