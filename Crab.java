import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author Nathaniel Baluda
 * @version 8/26/2021
 */
public class Crab extends Actor
{
    private int numOfWorms = 8;
    // This method repeats the following actions
    public void act()
    {
        move(0);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 4 ,getY());
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 4 ,getY());
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 4);
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 4);
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 4 ,getY());
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 4 ,getY());
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - 4);
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 4);
            turn(-5);
        }
    }
    // Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            numOfWorms--;
            // *** Winning the game *******************
            if(numOfWorms == 0)
            {
                Greenfoot.setWorld(new WinSplash());
               Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            // *****************************************
        }
        // Losing the game
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.setWorld(new loseScreen());
            Greenfoot.stop();
        }
    
    }
}



