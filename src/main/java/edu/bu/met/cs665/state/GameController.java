package edu.bu.met.cs665.state;

import java.util.List;

import edu.bu.met.cs665.mode.Mode;
import edu.bu.met.cs665.path.Path;
import edu.bu.met.cs665.path.Step;

/*
 * TODO: Delegation pattern
 * https://java-design-patterns.com/patterns/delegation/#programmatic-example-of-delegation-pattern-in-java
 * 
 */
public class GameController implements Mode {

  private final Mode mode;

  public GameController(Mode mode) {
    this.mode = mode;
  }

  @Override
  public boolean validatePath(Path gamePath, Path userPath) {
    List<Step> gameSteps = gamePath.getSteps();
    List<Step> userSteps = userPath.getSteps();

    if (gameSteps.size() != userSteps.size()) {
      return false;
    }
    
    return mode.validatePath(gamePath, userPath);
  }

}