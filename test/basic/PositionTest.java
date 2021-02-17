package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

	private Position position = new Position("f3");
	
	@Test
	void testPositionEquality() {
		assertTrue(position.equals(new Position("f3")));
	}
	
	@Test
	void constructorCorrectness() {
		// f3을 0부터 시작하는 인덱스로 계산하면 5,2가 됨.
		assertEquals(position.toString(), "5,2");
	}
}
