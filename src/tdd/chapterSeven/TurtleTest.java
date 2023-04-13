package tdd.chapterSeven;

import chapterSeven.classwork.turtle.Position;
import chapterSeven.classwork.turtle.Turtle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chapterSeven.classwork.turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle ijapa = new Turtle();

    @Test void turtleCanMovePenDownTest(){
        assertTrue(ijapa.penIsUp());

        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test void turtleCanMovePenUpTest(){
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());

        ijapa.penUp();
        assertTrue(ijapa.penIsUp());
    }

    @DisplayName("Turtle can turn right")
    @Test public void turtleCanTurnRightWhileFacingEastTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightWhileFacingSouthTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightWhileFacingWestTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightWhileFacingNorthTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @DisplayName("Turtle can turn left")
    @Test public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingNorthTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingWestTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanTurnLeftWhileFacingSouthTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @DisplayName("Turtle can move forward")
    @Test public void turtleCanMoveForwardWhileFacingEast(){
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getPosition());

        ijapa.moveForward(5);
        assertEquals(new Position(0,5), ijapa.getPosition());
    }

    @Test public void turtleCanMoveForwardWhileFacingSouth(){
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getPosition());

        ijapa.moveForward(5);
        assertEquals(new Position(5,0), ijapa.getPosition());
    }

    @Test public void turtleCanMoveForwardWhileFacingWest(){
        ijapa.moveForward(5);
        assertEquals(new Position(0,5), ijapa.getPosition());
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());

        ijapa.moveForward(5);
        assertEquals(new Position(0,0), ijapa.getPosition());
    }

    @Test public void turtleCanMoveForwardWhileFacingNorth(){
        ijapa.turnRight();
        ijapa.moveForward(5);
        assertEquals(new Position(5,0), ijapa.getPosition());
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());

        ijapa.moveForward(5);
        assertEquals(new Position(0,0), ijapa.getPosition());
    }
}
