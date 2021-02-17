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
		// f3�� 0���� �����ϴ� �ε����� ����ϸ� 5,2�� ��.
		assertEquals(position.toString(), "5,2");
	}
}
