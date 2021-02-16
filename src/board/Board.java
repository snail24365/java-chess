package board;


public class Board {
	
	private final int BOARD_MAX_SIZE = 8;
	private char[][] board = new char[BOARD_MAX_SIZE][BOARD_MAX_SIZE];
	
	public void set(int row, int col, char piece) {
		board[row][col] = piece;
	}
}
