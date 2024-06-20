package io.designpatterns.gof.creational.prototype;

/**
 * This the prototype class
 */
public abstract class Food implements Cloneable {

  public Food clone() throws CloneNotSupportedException {
    return (Food) super.clone();
  }

  protected abstract String[] details();

}
