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
        Crab rocketship = new Crab();
        addObject(rocketship,234,247);
        Worm sun = new Worm();
        addObject(sun,44,48);
        Worm sun2 = new Worm();
        addObject(sun2,183,84);
        Worm sun3 = new Worm();
        addObject(sun3,460,87);
        Worm sun4 = new Worm();
        addObject(sun4,540,296);
        Worm sun5 = new Worm();
        addObject(sun5,343,355);
        Worm sun6 = new Worm();
        addObject(sun6,437,436);
        Worm sun7 = new Worm();
        addObject(sun7,132,388);
        Worm sun8 = new Worm();
        addObject(sun8,225,513);
        Lobster goldball = new Lobster(rocketship);
        addObject(goldball,410,316);
        goldball.setLocation(516,504);
    }
}