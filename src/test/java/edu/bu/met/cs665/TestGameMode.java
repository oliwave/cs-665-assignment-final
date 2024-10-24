package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.mode.DifficultMode;
import edu.bu.met.cs665.mode.EasyMode;
import edu.bu.met.cs665.path.Color;
import edu.bu.met.cs665.path.Direction;
import edu.bu.met.cs665.path.Location;
import edu.bu.met.cs665.path.Path;
import edu.bu.met.cs665.path.Step;
import edu.bu.met.cs665.state.GameController;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestGameMode {

    GameController gc;

    @Test
    public void testEasyModeWithSameDirectionList() {
        gc = new GameController(new EasyMode());

        Path game = new Path();
        game.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        game.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        game.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        game.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        Path user = new Path();
        user.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        user.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        user.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        user.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        assertEquals(true, gc.validatePath(game, user));

    }

    @Test
    public void testEasyModeWithDifferentDirectionList() {
        gc = new GameController(new EasyMode());

        Path game = new Path();
        game.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        game.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        game.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        game.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        Path user = new Path();
        user.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        user.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        user.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        user.addStep(new Step(new Location(0, 3), Direction.DOWN, Color.YELLOW));

        assertEquals(false, gc.validatePath(game, user));

    }

    @Test
    public void testHardModeWithSameDirectionAndColorList() {
        gc = new GameController(new DifficultMode());

        Path game = new Path();
        game.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        game.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        game.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        game.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        Path user = new Path();
        user.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        user.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        user.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        user.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        assertEquals(true, gc.validatePath(game, user));

    }

    @Test
    public void testHardModeWithDifferentDirectionList() {
        gc = new GameController(new DifficultMode());

        Path game = new Path();
        game.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        game.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        game.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        game.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        Path user = new Path();
        user.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        user.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        user.addStep(new Step(new Location(2, 0), Direction.LEFT, Color.BLUE));
        user.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        assertEquals(false, gc.validatePath(game, user));

    }

    @Test
    public void testHardModeWithDifferentColorList() {
        gc = new GameController(new DifficultMode());

        Path game = new Path();
        game.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        game.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        game.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        game.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        Path user = new Path();
        user.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        user.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        user.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.WHITE));
        user.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        assertEquals(false, gc.validatePath(game, user));

    }

    @Test
    public void testHardModeWithEasyModeStandard() {
        gc = new GameController(new EasyMode());

        Path game = new Path();
        game.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        game.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        game.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        game.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        Path user = new Path();
        user.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        user.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        user.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        user.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        assertEquals(true, gc.validatePath(game, user));

    }

}
