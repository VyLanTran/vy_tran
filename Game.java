import java.awt.Component;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String args[]) {
		Board board = new Board();
		
		JFrame frame = new JFrame("Minesweeper");
		frame.setSize(600, 600);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(board);
	}

}
