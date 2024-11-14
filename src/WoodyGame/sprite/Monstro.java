package WoodyGame.sprite;

import WoodyGame.Commons;
import spriteframework.sprite.BadSprite;
import spriteframework.sprite.BadnessBoxSprite;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Monstro extends BadnessBoxSprite {

    private Gosma bomb = null;
    private String monstroImg = "images/monster";
    public String freezeImg = "images/monster";

    public Monstro(int x, int y, int id) {
        this.monstroImg = this.monstroImg + id + ".png";
        this.freezeImg = this.freezeImg + id +"bg.png";
        initBomber(x, y);
    }

    private void initBomber(int x, int y) {
        Random random = new Random();
        this.dx = (random.nextInt(Commons.MONSTER_SPEED*2 + 1) - Commons.MONSTER_SPEED);
        this.dy = (random.nextInt(Commons.MONSTER_SPEED*2 + 1) - Commons.MONSTER_SPEED);
        if(dx+dy == 0)
            dx++;
        this.x = x;
        this.y = y;

        bomb = new Gosma(x,y);


        ImageIcon ii = new ImageIcon(monstroImg);
        Image scaledImage = ii.getImage().getScaledInstance(Commons.MONSTER_WIDTH, Commons.MONSTER_HEIGHT, Image.SCALE_SMOOTH);
        setImage(scaledImage);

        imageHeight = Commons.MONSTER_HEIGHT;
        imageWidth = Commons.MONSTER_WIDTH;


    }



    public Gosma getBomb() {
        return bomb;
    }

    public void setBomb(Gosma bomb) {
        this.bomb = bomb;
    }


    @Override
    public LinkedList<BadSprite> getBadnesses() {
        LinkedList<BadSprite> aBomb = new LinkedList<BadSprite>();
        aBomb.add(bomb);
        return aBomb;
    }
}
