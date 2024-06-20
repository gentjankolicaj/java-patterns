package io.designpatterns.gof.creational.prototype;

public class Cake extends Food {

  private final double weight;

  public Cake(double weight) {
    super();
    this.weight = weight;
  }

  @Override
  public String[] details() {
    String[] array = new String[4];
    array[0] = "Weight : " + weight;
    array[1] = "Cream";
    array[2] = "Sugar";
    array[3] = this.getClass().getName();
    return array;
  }
}
