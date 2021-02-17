package basic;

public class Piece {
	private Position position;
	private Player player;
	
	public void changePosition(Position position) {
		this.position = position;
	}
}

enum Player {
	WHITE, BLACK
}