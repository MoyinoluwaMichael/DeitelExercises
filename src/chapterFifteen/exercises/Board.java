package chapterFifteen.exercises;

import java.util.Arrays;

public class Board {
    public static char[][] changeXAndO(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'x') board[i][j] = '1';
                else if (board[i][j] == 'O' || board[i][j] == 'o') board[i][j] = '0';
            }
        }
        return board;
    }

    public static void main(String[] args) {
        char [][] board = {
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        };

        for (var row : changeXAndO(board)) {
            System.out.println(Arrays.toString(row));
        }
    }
}
