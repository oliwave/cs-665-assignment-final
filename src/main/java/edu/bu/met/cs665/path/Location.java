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
  private int locX = 0;
  private int locY = 0;

  /**
   * Create the location with locX and locY.
   * 
   * @param locX The locX of the location
   * @param locY The locY of the location
   */
  public Location(int locX, int locY) {
    this.locX = locX;
    this.locY = locY;
  }

  /**
   * The getter method for getting locX.
   * 
   * @return Return locX
   */
  public int getLocX() {
    return this.locX;
  }

  /**
   * The getter method for getting locY.
   * 
   * @return Return locY
   */
  public int getLocY() {
    return this.locY;
  }
}
