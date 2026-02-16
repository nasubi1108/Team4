import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld1_2 extends World
{
    private int timecount = 1000;
    
    private int i = 0;
    boolean spaceWasDown = false;
    
    God theGod;
    enemy theEnemy;
    maou theMaou;
    /**
     * Constructor for objects of class MyWorld1_2.
     * 
     */
    public MyWorld1_2()
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
           if(theEnemy != null)
           {
               removeObject(theEnemy);
           }
           
           addObject( new hero(), 75, 250 );
           theGod = new God();
           addObject(theGod, 500, 250);
           showText("アノレノレ:やった、楽勝だね！もうどんな敵も怖くないや！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==1)
       {
           
           showText("神:ワシが最強の力を授けたからのう！",300,50);
           showText("では、魔王を討伐してもらうとしよう...",300,70);
           i++;
       }
       else if(i==2)
       {
           showText("アノレノレ:任せてよ！長い旅になったとしても",300,50);
           showText("必ず倒してみせる！",300,70);
           i++;
       }
       else if(i==3)
       {
           showText("神:そんなものは待ってられん！！授けた力は長くは続かん！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==4)
       {
           showText("神:今ここで魔王を召喚する！！",300,50);
           i++;
       }
       else if(i==5)
       {
           showText("アノレノレ:えええええええ！？いきなり！？",300,50);
           showText("というかそんなことできるの！？",300,70);
           i++;
       }
       else if(i==6)
       {
           showText("神:問答無用じゃ！！むむむ...カアアア！！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==7)
       {
           if(theGod != null)
           {
               removeObject(theGod);
           }
           
           theMaou = new maou();
           addObject(theMaou, 500, 250 );
           showText("アノレノレ:ちょっと待ってよ！まだ心の準備が！",300,50);
           showText("うわあああああああああ！！(バトル２突入)",300,70);
           i++;
       }
       
       else if(i==8)
       {
           i++;
           if(Greenfoot.isKeyDown("Space"))
           {
               Greenfoot.setWorld(new MyWorld2_2());
           }
       }
    
    
   }
       spaceWasDown = spaceDown;
   }
}


        
    

