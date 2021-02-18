package piece;

import basic.Position;

public abstract class Piece {
	private Position position;

	private Player player;
	
	public Piece(Position position, Player player) {
		this.position = position;
		this.player = player;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}

enum Player {
	WHITE, BLACK
}