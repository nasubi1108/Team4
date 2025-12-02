import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MyWorld extends World
{
    private int timecount = 1000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("background.png");
        setBackground(bg);
        
        addObject( new hero(), 100, 250 );
        addObject( new maou(), 500, 250 );
    }
    
    public void act()
       {
        timecount--;
        showText(""+timecount, 50,50 );
        if( timecount == 0 ){
           showText("TIME OVER", 300, 200);
           Greenfoot.stop();
       }  
        }
}
