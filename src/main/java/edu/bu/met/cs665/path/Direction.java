/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Direction.java
 * Description: This class is responsible for the methods and attributes of the Direction.
 */

package edu.bu.met.cs665.path;

/**
 * This is the Direction enum.
 * This class is responsible for representing a Direction.
 */
public enum Direction {
  UP("\u2191"),
  DOWN("\u2193"),
  LEFT("\u2190"),
  RIGHT("\u2192");

  private final String direction;

  /**
   * Create the Direction object.
   * 
   * @param direction the direction
   */
  Direction(String direction) {
    this.direction = direction;
  }

  /**
   * The getter method for any given direction.
   * 
   * @return Return Direction's literal string
   */
  public String getDirection() {
    return direction;
  }

}
