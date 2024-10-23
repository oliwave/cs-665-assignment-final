/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Toddler.java
 * Description: This class is responsible for the methods and attributes of the Toddler.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.view.DirectionButtons;
import edu.bu.met.cs665.view.GameGrid;
import edu.bu.met.cs665.view.Submit;
import edu.bu.met.cs665.view.MoveDisplay;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This is the Main class.
 */
public class Toddler extends Application {

  private GameGrid gameGrid = GameGrid.getGameGrid();
  private DirectionButtons directionButtons = DirectionButtons.getDirectionButtons();
  private MoveDisplay moveDisplay = MoveDisplay.getMoveDisplay();
  private Submit submit = Submit.getSubmit();

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project. This could prove convenient to test as you are
   * developing.
   * However, please note that every assignment/final projects requires JUnit
   * tests.
   */
  public static void main(String[] args) {
    launch(args);
  }

  /**
   * A callback method for JavaFX to invoke.
   *
   * @param primaryStage The stage of the UI
   */
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Toddler Memory Game");

    // Center the grid in the layout
    VBox gridContainer = new VBox(gameGrid.getGridPane());

    VBox vbox = new VBox(20, gridContainer, directionButtons.getButtons(), moveDisplay.getDisplayBox(),
        submit.getSubmitEasyButton(), submit.getSubmitHardButton());
    vbox.setPadding(new Insets(10));

    Scene scene = new Scene(vbox, 400, 450);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
