package io.designpatterns.gof.behavioral.chain;

/**
 * Identification: The pattern is recognizable by behavioral methods of one group of objects that
 * indirectly call the same methods in other objects, while all the objects follow the common
 * interface.
 */
public interface Handler {

  void handle(Request request);

  void next(Handler handler);

}
