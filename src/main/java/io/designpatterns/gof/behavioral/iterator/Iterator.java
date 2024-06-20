package io.designpatterns.gof.behavioral.iterator;

/**
 * @param <T>
 */
public interface Iterator<T> {

  boolean hasNext();

  T next();
}
