package chapterEight.selfAssessment.ticTacToe;

public class Player {
    private static int currentPlayer = 0;
    private BoardContent boardContent;
    private String symbol;
    private String name;
    private int currentRow;
    private int currentColumn;
    private String position = "";
    private String[] positions;
    private static final String[] magicNumbers = {"147", "258", "369", "159", "357", "123", "456", "789"};

    public Player(String playerName) {
        name = playerName;
        switch (currentPlayer) {
            case 0 -> {
                boardContent = BoardContent.O;
                symbol = boardContent.getContent();
            }
            case 1 -> {
                boardContent = BoardContent.X;
                symbol = boardContent.getContent();
            }
        }
        adjustCurrentPlayerCount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCurrentPlayer() {
        return currentPlayer;
    }

    public static void adjustCurrentPlayerCount() {
        currentPlayer++;
        currentPlayer = currentPlayer > 1 ? 0 : currentPlayer;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setPlayerPosition(int positionNumber) {
        setPosition(positionNumber);
        int index = positionNumber - 1;
        currentRow = index / 3;
        currentColumn = index % 3;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    private void setPosition(int position) {
        this.position += String.valueOf(position);
    }

    public String getPosition() {
        return position;
    }

    public boolean playerHasWonOverTime(String position) {
        setPositions(position);
        for (String magicNumber : magicNumbers) {
            if (positionIsContaining(magicNumber)) {
                return true;
            }
        }
        return false;
    }

    private void setPositions(String position) {
        positions = new String[position.length()];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = String.valueOf(position.charAt(i));
        }
    }

    private boolean positionIsContaining(String number) {
        String newNumber = "";
        for (int i = 0; i < number.length(); i++) {
            for (String s : positions) {
                if (String.valueOf(number.charAt(i)).equals(s)) {
                    newNumber += s;
                    break;
                }
            }
        }
        return newNumber.length()==3;
    }

    public static void makeFirstPlayerToBe(int firstPlayer) {
        currentPlayer = firstPlayer;
    }
}
