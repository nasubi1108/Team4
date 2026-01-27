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
    
    private int i = 0;
    boolean spaceWasDown = false;
    
    God theGod;
    enemy theEnemy;
    maou theMaou;
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
        
        if(Greenfoot.isKeyDown("space"))
       {
           addObject( new hukidashi(), 300, 65 );
        }
        
    }
    
    public void act()
    { 
       
        
       boolean spaceDown = Greenfoot.isKeyDown("space");
       if(spaceDown && !spaceWasDown)
       {
       if(i==0)
       {
           addObject( new hero(), 75, 250 );
           showText("神:アノレノレ...目覚めるのじゃ、アノレノレ...！",300,50);
           i++;
       }
       else if(i==1)
       {
           
           showText("アノレノレ:イタタ...あれ？ここは？ボク何してたっけ？",300,50);
           i++;
       }
       else if(i==2)
       {
           theGod = new God();
           addObject(theGod, 500, 250);
           
           showText("神:そこのモンスターに襲われて倒れていたのじゃよ",300,50);
           i++;
       }
       else if(i==3)
       {
           showText("アノレノレ:あ！ぶよぶよパズルの練習をしてたんだった！",300,50);
           i++;
       }
       else if(i==4)
       {
           showText("アノレノレ:魔王から世界を救うために",300,50);
           showText("早く力を付けないといけないのに！",300,70);
           i++;
       }
       else if(i==5)
       {
           showText("神:ほう...ならば、ぶよぶよ神であるこの我が",300,50);
           showText("最強の力を授けてやろう！",300,70);
           i++;
       }
       else if(i==6)
       {
           
           showText("アノレノレ:すごい！力がみなぎる！助かるよ！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==7)
       {
           if(theGod != null)
           {
               removeObject(theGod);
           }
           theEnemy = new enemy();
           addObject(theEnemy, 500, 250 );
           showText("神:では早速あのモンスターを倒すのじゃ！",300,50);
           showText("（バトル１突入)",300,70);
           i++;
           
       }
       
       else if(i==8)
       {
           
           if(Greenfoot.isKeyDown("Space"))
           {
               Greenfoot.setWorld(new MyWorld2());
           }
           
       }
       //バトル１を開始
       //バトル１をクリア
       
       
       //バトル２突入
       //バトル２終了
       
       
   }
       spaceWasDown = spaceDown;
   }
   
   
    
}
