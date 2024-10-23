/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Subscriber.java
 * Description: This class is responsible for the methods and attributes of the Subscriber.
 */

package edu.bu.met.cs665.utils.observer;

/**
 * This is the Subscriber class.
 * This class is responsible for representing a Subscriber.
 */
public interface Subscriber {

  /*
   * Get called when Publisher executes the notifySubscribers method.
   */
  void update(Publisher publisher);

}
