package io.designpatterns.gof.behavioral.iterator;

public interface Container<T> {

  Iterator<T> getIterator();

  int size();

}
