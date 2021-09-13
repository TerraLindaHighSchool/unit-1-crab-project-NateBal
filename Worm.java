import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class gets eaten by the crab
 * 
 * Nathaniel Baluda
 * 9/8/2021
 */
public class Worm extends Actor
{
    private int numOfWorms = 8;
    // Lets the worms move
    public void act()
    {
        switch(getWorld().getObjects(Worm.class).size())
        {
            case 1: 
                move(12);
                break;
            case 2:
                move (11);
                break;
            case 3:
                move (10);
                break;
            case 4:
                move (9);
                break;
            case 5:
                move (8);
                break;
            case 6:
                move (7);
                break;
            case 7:
                move(6);
                break;
            default:
                move(5);
        }
        turnAtEdge();
    }
    
    // Turns the Worm at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(70);
        }
    }
    
    // Makes worms move faster the more are dead
}
