package io.designpatterns.gof.behavioral.mediator;

import java.util.Map;
import java.util.Optional;

@SuppressWarnings("unused")
public interface Mediator<K> {

  Map<K, Component<K>> getComponents();

  Component<K> put(K key, Component<K> value);

  Component<K> remove(Component<K> value);

  Component<K> remove(K key, Component<K> value);

  <T> Optional<T> getValue(K key);

}
