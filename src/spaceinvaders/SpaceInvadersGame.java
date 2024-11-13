package spaceinvaders;

import java.awt.EventQueue;

import spriteframework.AbstractBoard;
import spriteframework.MainFrame;

public class SpaceInvadersGame extends MainFrame {


	public SpaceInvadersGame () {
		super("Space Invaders");
	}
	
	protected  AbstractBoard createBoard() {
		return new SpaceInvadersBoard();
	}


	public static void main(String[] args) {

		System.out.println("Space Invaders Game");
		EventQueue.invokeLater(() -> {

			new SpaceInvadersGame();
		});
	}

}
