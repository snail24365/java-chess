package position;

public class Position {
	public final static int EDGE_LEFT = 0;
	public final static int EDGE_RIGHT = 7;
	
	private int row;
	private int col;
	
	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public boolean isInBound() {
		return row <= EDGE_RIGHT || row >= EDGE_LEFT || col <= EDGE_RIGHT || col >= EDGE_LEFT;
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
