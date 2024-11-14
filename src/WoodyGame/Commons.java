package WoodyGame;

import java.awt.Color;

public interface Commons {

    int BOARD_WIDTH = 800;
    int BOARD_HEIGHT = 600;
    Color BOARD_COLOR = new Color(83, 186, 139);

    int MONSTER_WIDTH = 30;
    int MONSTER_HEIGHT = 50;
    int MONSTER_INIT_X = 150;
    int MONSTER_INIT_Y = 5;
    int NUMBER_OF_MONSTERS_TO_DESTROY = 9;
    int MONSTER_SPEED = 2;
    int MONSTER_MOVEMENT_RANDOMNESS = 1;
    int MONSTER_SHOT_CHANCE = 2;
    int MONSTER_SHOT_SPEED = 3;

    int PLAYER_WIDTH = 35;
    int PLAYER_HEIGHT = 55;
    int PLAYER_SPEED = 4;
    int RAY_SPEED = 8;

    int PROJECTILE_HEIGHT = 25;
    int PROJECTILE_WIDTH = 25;
}
