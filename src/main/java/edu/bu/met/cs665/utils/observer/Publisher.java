/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Publisher.java
 * Description: This class is responsible for the methods and attributes of the Publisher.
 */

package edu.bu.met.cs665.utils.observer;

/**
 * This is the Publisher class.
 * This class is responsible for representing a Publisher.
 */
public interface Publisher {

  /*
   * Allow Subscriber to register.
   */
  boolean subscribe(Subscriber s);

  /*
   * Allow Subscriber to unregister.
   */
  boolean unsubscribe(Subscriber s);

  /*
   * Notify subscribers when state has changed.
   */
  void notifySubscribers();
}
