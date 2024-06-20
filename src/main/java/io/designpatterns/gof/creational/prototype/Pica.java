package io.designpatterns.gof.creational.prototype;

public class Pica extends Food {

  private final double weight;

  public Pica(double weight) {
    this.weight = weight;
  }


  @Override
  public String[] details() {
    String[] array = new String[4];
    array[0] = "Weight : " + weight;
    array[1] = "Flour";
    array[2] = "Cheese";
    array[3] = this.getClass().getName();
    return array;
  }
}
