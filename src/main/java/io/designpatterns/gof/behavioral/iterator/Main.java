package io.designpatterns.gof.behavioral.iterator;

import io.designpatterns.gof.behavioral.iterator.impl.SimpleContainer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    SimpleContainer<String> namesContainer = new SimpleContainer<>(10);
    namesContainer.add("John-117");
    namesContainer.add("Kai-125");
    namesContainer.add("Vannak-134");
    namesContainer.add("Riz-028");

    //Print using iterator
    for (Iterator<String> itr = namesContainer.getIterator(); itr.hasNext(); ) {
      log.info("Iterator: {}", itr.next());
    }

    log.info("\n");

    //print using get
    for (int i = 0; i < namesContainer.size(); i++) {
      log.info("Get: {}", namesContainer.get(i));
    }
  }

}
