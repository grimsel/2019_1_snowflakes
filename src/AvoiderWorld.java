// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * This is a simple game
 */
public class AvoiderWorld extends World
{
    private GreenfootSound backgroundMusic =  new  GreenfootSound("sounds/TRG_Banks_-_08_-_A_Christmas_adventure_Part_1.mp3");
    private int spawnRate = 20;
    private int speed = 1;
    private Counter scoreBoard;
    private int nextLevel = 100;

    /**
     * Constructor for objects of class MyWorld.
     */
    public AvoiderWorld()
    {
        super(640, 480, 1, false);
        backgroundMusic.playLoop();
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(1000) < spawnRate) {
            Snowflake snowflake =  new  Snowflake();
            snowflake.setSpeed(speed);
            addObject(snowflake, Greenfoot.getRandomNumber(getWidth() - 20) + 10, -30);
            scoreBoard.add(1);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Grinch avatar =  new  Grinch();
        addObject(avatar, 287, 232);
        scoreBoard =  new  Counter("Score: ");
        addObject(scoreBoard, 70, 20);
    }

    /**
     * 
     */
    public void endGame()
    {
        backgroundMusic.stop();
        GameOver go =  new  GameOver();
        Greenfoot.setWorld(go);
    }

    /**
     * 
     */
    public void increaseLevel()
    {
        final int score = scoreBoard.getValue();
        if (score > nextLevel) {
            spawnRate = spawnRate + 2;
            speed = speed + 1;
            nextLevel = nextLevel + 100;
        }
    }
}
