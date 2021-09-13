import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The lobester class wanders until it hits the crab and ends the game
 * 
 * Nathaniel Baluda
 * 9/8/2021
 */
public class Lobster extends Actor
{
       // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}
