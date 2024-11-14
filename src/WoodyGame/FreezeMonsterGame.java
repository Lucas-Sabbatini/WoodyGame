package WoodyGame;

import spriteframework.AbstractBoard;
import spriteframework.MainFrame;

import java.awt.*;

public class FreezeMonsterGame extends MainFrame {

    public FreezeMonsterGame() {
        super("Freeze Monsters", Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
    }

    @Override
    protected AbstractBoard createBoard() {
        return new FreezeMonsterBoard();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(FreezeMonsterGame::new);
    }
}
