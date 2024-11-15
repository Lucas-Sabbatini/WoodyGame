package spriteframework;

import javax.swing.JFrame;

public abstract class MainFrame extends JFrame  {

    // hotspot
    protected abstract AbstractBoard createBoard();
    
    public MainFrame(String t) {
          
        add(createBoard());
		
		setTitle(t);
		setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
    }

	public MainFrame(String t, int boardWidth, int boardHeight) {

		add(createBoard());
		setTitle(t);
		setSize(boardWidth, boardHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
    
}
