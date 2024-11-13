package spaceinvaders.sprite;

import javax.swing.ImageIcon;

import spriteframework.sprite.BadSprite;


public class Shot extends BadSprite {

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        String shotImg = "/images/shot.png";
        java.net.URL imgURL = getClass().getResource(shotImg);
        if (imgURL != null) {
            ImageIcon ii = new ImageIcon(imgURL);
            setImage(ii.getImage());
        } else {
            System.err.println("Couldn't find file: " + shotImg);
        }

        int H_SPACE = 6;
        setX(x + H_SPACE);

        int V_SPACE = 1;
        setY(y - V_SPACE);
    }
}
