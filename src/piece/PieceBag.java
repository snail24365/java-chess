package piece;

import java.util.ArrayList;
import java.util.List;

import position.Position;

public class PieceBag {
	private List<Piece> pieces;
	
	public PieceBag() {
		pieces = new ArrayList<Piece>();
	}
	
	public void addPiece(Piece piece) {
		pieces.add(piece);
	}
	
	public Piece getPiece(Position position) {
		return pieces.stream().filter(p->p.isAt(position)).findFirst().get();
	}
}
