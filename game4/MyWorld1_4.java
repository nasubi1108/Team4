import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld1_4 extends World
{
    private int timecount = 1000;
    
    private int i = 0;
    boolean spaceWasDown = false;
    
    God theGod;
    enemy theEnemy;
    maou theMaou;
    hero theHero;
    /**
     * Constructor for objects of class MyWorld1_2.
     * 
     */
    public MyWorld1_4()
    {    
       super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("background.png");
        setBackground(bg);
        
        if(Greenfoot.isKeyDown("space"))
       {
           addObject( new hukidashi(), 300, 65 );
        }
        
    }
    
    public void act()
    {  
        
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       boolean spaceDown = Greenfoot.isKeyDown("space");
       if(spaceDown && !spaceWasDown)
       {
       if(i==0)
       {
           theHero = new hero();
           addObject(theHero, 75, 300 );
           
           theGod = new God();
           addObject(theGod, 500, 250 );
           
           theMaou = new maou();
           addObject(theMaou, 75, 150);
           
           showText("神:ぐあああああ！魔力が...！身体が保てない！！",300,50);
           showText("",300,70);
           i++;
 
       }
 
       else if(i==1)
 
       {
 
           showText("魔王:終わりだ！邪神よ！俺とともに地獄へ墜ちろ！",300,50);
 
           i++;
 
       }
 
       else if(i==2)
 
       {
 
           showText("アノレノレ:魔王！？何をするつもり！？",300,50);
 
           i++;
 
       }
 
       else if(i==3)
 
       {
 
           showText("魔王:アノレノレ...俺の最後の闇の力で神を存在ごと消す！",300,50);
 
           i++;
 
       }
 
       else if(i==4)
 
       {
 
           showText("魔王:このぶよぶよ界を託したぞ！",300,50);
 
           i++;
 
       }
 
       else if(i==5)
 
       {
 
           showText("アノレノレ:魔王！う、うわああああああああああ！！",300,50);
 
           i++;
 
       }
 
       else if(i==6)
 
       {
           if(theMaou != null)
           {
               removeObject(theMaou);
           }
           
           if(theGod != null)
           {
               removeObject(theGod);
           }
           
           if(theHero != null)
           {
               removeObject(theHero);
           }
           
           addObject(theHero, 75, 250 );
           
           showText("アノレノレ:...ふ、二人とも消えちゃった...",300,50);
 
           i++;
 
       }
 
       else if(i==7)
 
       {
 
           showText("ア:でもこれで世界は平和になったね！",300,50);
 
           showText("今日から鍛え直さなきゃ！頑張るぞぉ〜！",300,70);
 
           i++;
 
       }
 
       else if(i==8)
 
       {
 
           showText("GAMECLEAR!!",300,50);
 
           showText("おめでとう",300,70);
 
           i++;
 
       }
           
           
           
           
       
    
    
   }
       spaceWasDown = spaceDown;
   }
}


        
    

