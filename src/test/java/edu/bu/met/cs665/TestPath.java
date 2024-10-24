package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.path.Color;
import edu.bu.met.cs665.path.Direction;
import edu.bu.met.cs665.path.Location;
import edu.bu.met.cs665.path.Path;
import edu.bu.met.cs665.path.Step;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestPath {

    @Test
    public void testGetStep() {

        Path path = new Path();
        Step step = new Step(new Location(0, 0), Direction.DOWN);
        path.addStep(step);

        assertEquals(step, path.getSteps().get(0));
    }

    @Test
    public void testGetStepLocation() {
        Path path = new Path();
        Step step = new Step(new Location(0, 1), Direction.DOWN);
        path.addStep(step);

        assertEquals(0, path.getSteps().get(0).getLocation().getLocX());
        assertEquals(1, path.getSteps().get(0).getLocation().getLocY());
    }

    @Test
    public void testGetStepDirection() {
        Path path = new Path();
        Step step = new Step(new Location(0, 0), Direction.DOWN);
        path.addStep(step);

        assertEquals(Direction.DOWN, path.getSteps().get(0).getDirection());
    }

    @Test
    public void testGetStepColorString() {
        Path path = new Path();
        Step step = new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW);
        path.addStep(step);

        assertEquals(Color.YELLOW.getColor(), path.getSteps().get(0).getColor());
    }

    @Test
    public void testPathLength() {
        Path path = new Path();
        path.addStep(new Step(new Location(0, 0), Direction.DOWN, Color.YELLOW));
        path.addStep(new Step(new Location(0, 1), Direction.UP, Color.WHITE));
        path.addStep(new Step(new Location(2, 0), Direction.RIGHT, Color.BLUE));
        path.addStep(new Step(new Location(0, 3), Direction.LEFT, Color.YELLOW));

        assertEquals(4, path.getSteps().size());
    }

}
