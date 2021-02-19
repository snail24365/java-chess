package piece;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import position.Position;

class KnightPieceTest {

	@Test
	void testKnightMovePosition() {
		KnightPiece knightPiece = new KnightPiece(new Position(3, 3), Player.BLACK);
		List<Position> possibleMoves  = knightPiece.getPossibleMove();
		Position[] expectedPositions = {new Position(2, 1), new Position(4, 1), new Position(5, 2), new Position(1, 2), 
									new Position(1, 4), new Position(2, 5), new Position(4, 5), new Position(5, 4) };
		for (Position expectedPosition : expectedPositions) {
			assertTrue(possibleMoves.contains(expectedPosition));
		}
	}
	
	@Test
	void testKnightMovePosition2() {
		// Boundary Case row : 0 col : 0
		KnightPiece knightPiece = new KnightPiece(new Position(0, 0), Player.BLACK);
		List<Position> possibleMoves  = knightPiece.getPossibleMove();
		assertTrue(possibleMoves.size() == 2);
		Position[] expectedPositions = {new Position(1, 2), new Position(2, 1)};
		for (Position expectedPosition : expectedPositions) {
			assertTrue(possibleMoves.contains(expectedPosition));
		}
	}

}
