import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld_T here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld_T extends World
{

    /**
     * Constructor for objects of class MyWorld_T.
     * 
     */
    public MyWorld_T()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("awa.jpg");
        setBackground(bg);
        
        addObject( new Title(), 300, 150 );
        
        showText("すたーと:spaceキー", 300, 300);
        
        
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
           Greenfoot.setWorld(new MyWorld());
        }
    }
}
