package spaceinvaders.sprite;

import javax.swing.ImageIcon;

import spriteframework.sprite.BadSprite;

public class Bomb extends BadSprite {

    private boolean destroyed;

    public Bomb(int x, int y) {

        initBomb(x, y);
    }

    private void initBomb(int x, int y) {

        setDestroyed(true);

        this.x = x;
        this.y = y;

        String bombImg = "/images/bomb.png";
        java.net.URL imgURL = getClass().getResource(bombImg);
        if (imgURL != null) {
            ImageIcon ii = new ImageIcon(imgURL);
            setImage(ii.getImage());
        } else {
            System.err.println("Couldn't find file: " + bombImg);
        }
    }

    public void setDestroyed(boolean destroyed) {

        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {

        return destroyed;
    }
    
    
}
