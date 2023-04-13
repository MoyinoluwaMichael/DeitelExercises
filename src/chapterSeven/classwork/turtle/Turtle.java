package chapterSeven.classwork.turtle;

import static chapterSeven.classwork.turtle.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private Direction currentDirection = EAST;
    private Position position = new Position(0, 0);

    public boolean penIsUp() {
        return penIsUp;
    }

    public void penDown() {
        penIsUp = false;
    }

    public void penUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == EAST) face(SOUTH);
        else if (currentDirection == SOUTH) face(WEST);
        else if (currentDirection == WEST) face(NORTH);
        else if (currentDirection == NORTH) face(EAST);
    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if (currentDirection == EAST) face(NORTH);
        else if (currentDirection == NORTH) face(WEST);
        else if (currentDirection == WEST) face(SOUTH);
        else if (currentDirection == SOUTH) face(EAST);
    }

    public Position getPosition() {
        return position;
    }

    public void moveForward(int numberOfSteps) {
        if (currentDirection == EAST) increaseColumn(numberOfSteps);
        else if (currentDirection == SOUTH) increaseRow(numberOfSteps);
        else if (currentDirection == WEST) decreaseColumn(numberOfSteps);
        else if (currentDirection == NORTH) decreaseRow(numberOfSteps);
    }

    private void decreaseRow(int numberOfSteps) {
        position.setRow(position.getRow() - numberOfSteps);
    }

    private void decreaseColumn(int numberOfSteps) {
        position.setColumn(position.getColumn() - numberOfSteps);
    }

    private void increaseRow(int numberOfSteps) {
        position.setRow(position.getRow() + numberOfSteps);
    }

    private void increaseColumn(int numberOfSteps) {
        position.setColumn(position.getColumn() + numberOfSteps);
    }
}
