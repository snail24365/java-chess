package piece;

import java.util.List;
import java.util.stream.Collectors;

import position.Position;

public abstract class Piece {
	protected Position position;

	private Player player;
	
	public Piece(Position position, Player player) {
		this.position = position;
		this.player = player;
	}

	public void moveTo(Position position) {
		this.position = position;
	}
	
	public boolean isAt(Position position) {
		return this.position.equals(position);
	}
	
	public abstract List<Position> getPossibleMove(); 
	
	protected List<Position> filterBoundedPosition(List<Position> positions) {
		return positions.stream().filter(p -> p.isInBound()).collect(Collectors.toList());
	}
}
