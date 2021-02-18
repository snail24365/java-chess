package position;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import position.Position;

class PositionTest {

	
	@Test
	void testPositionEquality() {
		Position position = new Position(5,3);
		assertTrue(position.equals(new Position(5,3)));
	}
}
