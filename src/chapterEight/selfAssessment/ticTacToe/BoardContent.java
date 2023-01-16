package chapterEight.selfAssessment.ticTacToe;

public enum BoardContent {
    EMPTY(" "),
    X("X"),
    O("O");

    private String content;
    BoardContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
}
