package WoodyGame.sprite;


import WoodyGame.Commons;
import spriteframework.sprite.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Woody extends Player {

    public Woody() {
        super();
        setX(Commons.BOARD_WIDTH-100);
        setY(Commons.BOARD_HEIGHT-200);
    }

    @Override
    protected void loadImage() {
        ImageIcon ii = new ImageIcon("images/woody.png");
        Image scaledImage = ii.getImage().getScaledInstance(Commons.PLAYER_WIDTH, Commons.PLAYER_HEIGHT, Image.SCALE_SMOOTH);
        setImage(scaledImage);

        imageWidth = Commons.PLAYER_WIDTH;
        imageHeight = Commons.PLAYER_HEIGHT;
    }

    @Override
    public void act() {

        x += dx;
        y += dy;

        if (x <= 2) {

            x = 2;
        }

        if (y <= 2) {

            y = 2;
        }

        if (x >= Commons.BOARD_WIDTH - imageWidth) {

            x = Commons.BOARD_WIDTH - imageWidth;
        }

        if (y >= Commons.BOARD_HEIGHT - imageHeight) {

            y = Commons.BOARD_HEIGHT - imageHeight;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            super.lastDirection = 1;
            dx = -Commons.PLAYER_SPEED;
        }

        if (key == KeyEvent.VK_RIGHT) {
            super.lastDirection = 3;
            dx = Commons.PLAYER_SPEED;
        }

        if (key == KeyEvent.VK_UP) {
            super.lastDirection = 2;
            dy = -Commons.PLAYER_SPEED;

        }

        if (key == KeyEvent.VK_DOWN) {
            super.lastDirection = 4;
            dy = Commons.PLAYER_SPEED;
        }
    }


}
