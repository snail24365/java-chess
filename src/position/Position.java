package basic;

public class Position {
	private int row;
	private int col;
	
	public Position(String declarePhase) {
		// TODO declarePhase 검증해주는 코드 작성하기
		declarePhase = declarePhase.toLowerCase();
		row = declarePhase.charAt(0) - 'a';
		col = declarePhase.charAt(1) - '1';
	}
	
	@Override
	public String toString() {
		return String.join(",", String.valueOf(row), String.valueOf(col));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
}
