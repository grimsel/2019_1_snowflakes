// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snowflake extends Actor
{
    private int speed = 1;

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        checkRemove();
    }

    /**
     * 
     */
    public void checkRemove()
    {
        World w = getWorld();
        if (getY() > w.getHeight() + 30) {
            w.removeObject(this);
        }
    }

    /**
     * 
     */
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
