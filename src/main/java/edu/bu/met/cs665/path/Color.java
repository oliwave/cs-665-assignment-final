package edu.bu.met.cs665.path;

public enum Color {
  BLUE("blue"),
  // Default color
  WHITE("white"),
  YELLOW("yellow");

  private final String color;

  Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

}
