import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,234,247);
        Worm worm = new Worm();
        addObject(worm,44,48);
        Worm worm2 = new Worm();
        addObject(worm2,183,84);
        Worm worm3 = new Worm();
        addObject(worm3,460,87);
        Worm worm4 = new Worm();
        addObject(worm4,540,296);
        Worm worm5 = new Worm();
        addObject(worm5,343,355);
        Worm worm6 = new Worm();
        addObject(worm6,437,436);
        Worm worm7 = new Worm();
        addObject(worm7,132,388);
        Worm worm8 = new Worm();
        addObject(worm8,225,513);
        Lobster lobster = new Lobster(crab);
        addObject(lobster,410,316);
        lobster.setLocation(516,504);
    }
}