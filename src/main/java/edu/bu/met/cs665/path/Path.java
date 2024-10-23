/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Path.java
 * Description: This class is responsible for the methods and attributes of the Path.
 */

package edu.bu.met.cs665.path;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Path class.
 * This class is responsible for representing a Path.
 */
public class Path {
  private List<Step> path;

  /**
   * Create the Path object.
   */
  public Path() {
    this.path = new ArrayList<>();
  }

  /**
   * Add a step to the path.
   * 
   * @param step the Step object
   */
  public void addStep(Step step) {
    this.path.add(step);
  }

  /**
   * The getter method for getting a list of steps.
   * 
   * @return Return a list of Steps
   */
  public List<Step> getSteps() {
    return new ArrayList<>(path);
  }

}
