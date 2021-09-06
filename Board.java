import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class Board extends JPanel {
	
	private final int CELL_SIZE = 10;
	private final int ROWS = 9;
	private final int COLUMNS = 9;
	private final int MINES = 10;
	
	private boolean gameOver;
	
	int[][] board = new int[9][9]
	
	do {
		Random rand = new Random();
		int r_rand = rand.nextInt(9);
		int c_rand = rand.nextInt(9);
		Cell cell = new Cell(r_rand, c_rand);
		cell.setValue(-1);
	
		MINES  -= 1;
	}
	while (MINES >= 0);
	
	for (int i = 0; i < ROWS; i++) {
		for (int j = 0; j < COLUMNS; j++) {
			Cell cell = new Cell(i, j);
			if ((i == 0 && j == 0) || (i == ROWS - 1 && j == 0) ||
				(i == 0 && j == COLUMNS - 1) || (i == ROWS - 1 && j == COLUMNS - 1)) 
			{
				
			}
		}
	}
	
	public int checkNeighbors(int a, int b, int c, int d) {
		int minedNeighbors = 0;
	}
		for (int i = a; i <= b; i++) {
			for (int j = c; j <=d; i++) {
				Cell checkingCell = new Cell(i, j);
				if (checkingCell)
			}
		}
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		int w = getWidth() / ROWS;
		int h = getHeight() / COLUMNS;
		
		int k = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				int x = i * w;
				int y = j * h;
				
				Color color = k % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY;
				g2d.setColor(color);
				g2d.fillRect(x, y, w, h);
				
				k++;
			}
		}
}
