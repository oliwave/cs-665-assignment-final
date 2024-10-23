/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Publisher.java
 * Description: This class is responsible for the methods and attributes of the Publisher.
 */

package edu.bu.met.cs665.utils.observer;

public interface Publisher {

  boolean subscribe(Subscriber s);

  boolean unsubscribe(Subscriber s);

  void notifySubscribers();
}
