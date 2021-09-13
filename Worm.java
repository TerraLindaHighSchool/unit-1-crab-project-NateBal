import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class gets eaten by the crab
 * 
 * Nathaniel Baluda
 * 9/8/2021
 */
public class Worm extends Actor
{
    private int numOfWorms;
    // Lets the worms move
    public void act()
    {
        numOfWorms = getWorld().getObjects(Worm.class).size();
        move(12 - numOfWorms);
        turnAtEdge();
    }
    
    // Turns the Worm at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(160) + 20);
        }
    }
    
    // Makes worms move faster the more are dead
}
