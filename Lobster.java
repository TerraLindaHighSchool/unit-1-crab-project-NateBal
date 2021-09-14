import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The lobester class wanders until it hits the crab and ends the game
 * 
 * Nathaniel Baluda
 * 9/8/2021
 */
public class Lobster extends Actor
{
        //Moves towards Crab
    private Crab player;
    
    public Lobster(Crab rocketship)
    {
        player = rocketship;
    }
    
    // This method repeats the following actions
    public void act()
    {
        switch(getWorld().getObjects(Worm.class).size())
        {
            case 1: 
                move(5);
                break;
            case 2:
                move (4);
                break;
            case 3:
                move (4);
                break;
            case 4:
                move (3);
                break;
            case 5:
                move (3);
                break;
            case 6:
                move (2);
                break;
            case 7:
                move(1);
                break;
            default:
                move(0);
        }
        turnAtEdge();
        turnTowards(player.getX(), player.getY());
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
