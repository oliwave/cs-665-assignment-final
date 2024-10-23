/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Color.java
 * Description: This class is responsible for the methods and attributes of the DirectionButtons.
 */

package edu.bu.met.cs665.path;

/**
 * This is the Color enum.
 * This class is responsible for representing a Color.
 */
public enum Color {
  BLUE("blue"),
  // Default color
  WHITE("white"),
  YELLOW("yellow");

  private final String color;

  /**
   * Create the Color object.
   * 
   * @param color the color
   */
  Color(String color) {
    this.color = color;
  }

  /**
   * The getter method for any given color.
   * 
   * @return Return Color's literal string
   */
  public String getColor() {
    return color;
  }

}
