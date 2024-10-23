/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Location.java
 * Description: This class is responsible for the methods and attributes of the Location.
 */

package edu.bu.met.cs665.path;

/**
 * This is the Location class.
 * This class is responsible for representing a Location.
 */
public class Location {
  private int x = 0;
  private int y = 0;

  /**
   * Create the location with x and y.
   * 
   * @param x The x of the location
   * @param y The y of the location
   */
  public Location(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * The getter method for getting x
   * 
   * @return Return x
   */
  public int getX() {
    return this.x;
  }

  /**
   * The getter method for getting y
   * 
   * @return Return y
   */
  public int getY() {
    return this.y;
  }
}
