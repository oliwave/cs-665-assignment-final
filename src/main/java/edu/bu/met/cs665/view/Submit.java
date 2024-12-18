/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/05/2024
 * File Name: Submit.java
 * Description: This class is responsible for the methods and attributes of the Submit.
 */

package edu.bu.met.cs665.view;

import edu.bu.met.cs665.mode.DifficultMode;
import edu.bu.met.cs665.mode.EasyMode;
import edu.bu.met.cs665.mode.Mode;
import edu.bu.met.cs665.state.Game;
import edu.bu.met.cs665.state.GameController;
import edu.bu.met.cs665.state.Player;
import edu.bu.met.cs665.utils.observer.Publisher;
import edu.bu.met.cs665.utils.observer.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

/**
 * This is the Submit class.
 * This class is responsible for representing a Submit.
 */
public class Submit implements Publisher {
  private Button submitEasyButton = new Button("Easy");
  private Button submitHardButton = new Button("Hard");
  private List<Subscriber> subscribers = new ArrayList<>();
  private GameController gc;
  private Player player = Player.getPlaryer(this);
  private Game game = Game.getGame(this);
  private static Submit submit;

  /**
   * Create a Submit object.
   */
  private Submit() {
    submitEasyButton.setOnAction(e -> submit(new EasyMode()));
    submitHardButton.setOnAction(e -> submit(new DifficultMode()));
  }

  /**
   * The static method to get the Submit object.
   * 
   * @return A Submit object
   */
  public static Submit getSubmit() {
    if (submit == null) {
      submit = new Submit();
    }

    return submit;
  }

  /**
   * Getter method for submit hard button.
   * 
   * @return A submit hard buttun
   */
  public Button getSubmitHardButton() {
    return submitHardButton;
  }

  /**
   * Getter method for submit easy button.
   * 
   * @return A sumit eary button
   */
  public Button getSubmitEasyButton() {
    return submitEasyButton;
  }

  /**
   * Submit the results and see if userr win the game.
   * 
   * @param m Easy mode or hard mode
   */
  private void submit(Mode m) {
    gc = new GameController(m);

    String successMsg = "Congratulations! You've followed the correct path and won the game.";
    String failureMsg = "Oops! The path you entered is incorrect. Better luck next time!";

    if (gc.validatePath(game.getPath(), player.getPath())) {
      showAlert("Success", successMsg);
    } else {
      showAlert("Failure", failureMsg);
    }

    notifySubscribers();
  }

  /**
   * Show an alert box for game feedback and restart option.
   * 
   * @param title   The alert title
   * @param msg The msg content
   */
  private void showAlert(String title, String msg) {
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(msg + "\nWould you like to play again?");

    ButtonType yesButton = new ButtonType("Yes");
    ButtonType noButton = new ButtonType("No");
    alert.getButtonTypes().setAll(yesButton, noButton);

    Optional<ButtonType> result = alert.showAndWait();
    if (result.isPresent() && result.get() == noButton) {
      System.exit(0);
    }
  }

  /**
   * Subscribe the Submit event.
   * 
   * @param s The subscriber
   * @return Return true if subscription to the Submit event successfully
   */
  @Override
  public boolean subscribe(Subscriber s) {
    if (s != null) {
      this.subscribers.add(s);
      return true;
    }

    return false;
  }

  /**
   * Unsubscribe the Submit event.
   * 
   * @param s The subscriber
   * @return Return true if subscription to the Submit event is removed
   *         successfully
   */
  @Override
  public boolean unsubscribe(Subscriber s) {
    if (s != null) {
      return this.subscribers.remove(s);
    }

    return false;
  }

  /**
   * Notify all subscribers when the state of the Submit object changes.
   */
  @Override
  public void notifySubscribers() {
    for (Subscriber s : this.subscribers) {
      s.update(this);
    }
  }

}
