package piece;

import java.util.ArrayList;
import java.util.List;

import position.Position;

public class KnightPiece extends Piece {

	public KnightPiece(Position position, Player player) {
		super(position, player);
	}

	@Override
	public List<Position> getPossibleMove() {
		int[] offset = {2,1};
		List<Position> ret = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int rowDirection = (i<2 ? 1 : -1);
			int colDirection = (i%2==0 ? 1 : -1);
			ret.add(this.position.pivote(rowDirection*offset[0], colDirection*offset[1]));
			ret.add(this.position.pivote(rowDirection*offset[1], colDirection*offset[0]));			
		}
		ret = filterBoundedPosition(ret);
		return ret;
	}

}
