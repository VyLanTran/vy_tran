
public class Cell {
	
	private int r;
	private int c;
	private int value; // -1 if it has mine, 0 if it has no mined neighbor,
					   // 1, 2, 3 if it has 1, 2, 3 mined neighbors
	private boolean revealed;
	
	public Cell(int r, int c) {
		this.r = r;
		this.c = c;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean getStatus() {
		return revealed;
	}
	public void setStatus(boolean revealed) {
		this.revealed = revealed;
	}

}
