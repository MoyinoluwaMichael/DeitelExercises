package chapterSeven.selfAssessment.knightTour2;

public class Player {
    private String name;
    private Status status;
    private int currentRowPosition;
    private int currentColumnPosition;

    public Player(String name){
        this.name = name;
    }

    public int getCurrentRowPosition() {
        return currentRowPosition;
    }

    public void setCurrentRowPosition(int currentRowPosition) {
        this.currentRowPosition = currentRowPosition;
    }

    public int getCurrentColumnPosition() {
        return currentColumnPosition;
    }

    public void setCurrentColumnPosition(int currentColumnPosition) {
        this.currentColumnPosition = currentColumnPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
