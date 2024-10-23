package edu.bu.met.cs665.utils.observer;

public interface Publisher {

  boolean subscribe(Subscriber s);

  boolean unsubscribe(Subscriber s);

  void notifySubscribers();
}
