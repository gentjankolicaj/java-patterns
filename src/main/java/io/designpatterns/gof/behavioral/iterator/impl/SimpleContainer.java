package io.designpatterns.gof.behavioral.iterator.impl;


import io.designpatterns.gof.behavioral.iterator.Container;
import io.designpatterns.gof.behavioral.iterator.Iterator;
import java.util.Objects;

@SuppressWarnings("unchecked")
public class SimpleContainer<T> implements Container<T> {

  private final int grow;
  /**
   * The number of times this list has been structurally modified. Structural modifications are
   * those that change the size of the list, or otherwise perturb it in such a fashion that
   * iterations in progress may yield incorrect results.
   */
  protected int modCount = 0;
  private T[] data;
  private int size;

  public SimpleContainer(int initialCapacity) {
    this.size = 0;
    this.grow = initialCapacity;
    this.data = (T[]) new Object[initialCapacity];
  }

  public SimpleContainer(int initialCapacity, int grow) {
    this.size = 0;
    this.grow = grow;
    this.data = (T[]) new Object[initialCapacity];
  }

  @Override
  public Iterator<T> getIterator() {
    return new StringIterator();
  }


  @Override
  public int size() {
    return size;
  }

  public boolean add(T entry) {
    if (size == data.length) {
      grow();
    }
    ++modCount;
    data[size++] = entry;
    return true;
  }

  public T get(int index) {
    Objects.checkIndex(index, size);
    return data[index];
  }

  private void grow() {
    int newSize = size + grow;
    T[] newArray = (T[]) new Object[size];
    System.arraycopy(data, 0, newArray, 0, data.length);
    this.size = newSize;
    this.data = newArray;
  }

  class StringIterator implements Iterator<T> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return index < data.length;
    }

    @Override
    public T next() {
      if (hasNext()) {
        return data[index++];
      }
      return null;
    }
  }
}
