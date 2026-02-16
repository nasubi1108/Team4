import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld1_3 extends World
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
    public MyWorld1_3()
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
       GreenfootImage bg2 = new GreenfootImage("background2.png"); 
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       boolean spaceDown = Greenfoot.isKeyDown("space");
       if(spaceDown && !spaceWasDown)
       {
       if(i==0)
 
       {
           if(theMaou != null)
           {
               removeObject(theMaou);
           }
           
           theHero = new hero();
           addObject(theHero, 75, 250 );
           
           theGod = new God();
           addObject(theGod, 500, 250 );
           
           showText("アノレノレ:やったああああ！！なんとか魔王を倒せたぞ！",300,50);
           showText("",300,70);
           i++;
 
       }
 
       else if(i==1)
 
       {
 
           showText("神: .....。",300,50);
 
           i++;
 
       }
 
       else if(i==2)
 
       {
 
           showText("アノレノレ: ...？これで世界を救えたんだよね！",300,50);
 
           i++;
 
       }
 
       else if(i==3)
 
       {
 
           showText("神:フフフ......ハハハハハハ！",300,70);
 
           i++;
 
       }
 
       else if(i==4)
 
       {
 
           showText("アノレノレ:どう...したの？神様...？",300,50);
           showText("",300,70);
 
           i++;
 
       }
 
       else if(i==5)
 
       {
 
           showText("神:バカめ！まんまと騙されおって！！",300,50);
 
           i++;
 
       }
 
       else if(i==6)
 
       {
            setBackground(bg2);
           showText("神:これで世界はワシのものじゃあああああああああ！！",300,50);
 
           i++;
 
       }
 
       else if(i==7)
 
       {
 
           showText("アノレノレ:な...なに...？どういうこと...？",300,50);
 
           i++;
 
       }
 
       else if(i==8)
 
       {
 
           showText("神:はぁ...いいだろう、冥土の土産に教えてやるぞい！",300,50);
 
           i++;
 
       }
 
       else if(i==9)
 
       {
 
           showText("神:ワシはこの素晴らしい世界を支配したかった...",300,50);
           showText("だが下界には直接干渉できない！",300,70);
           i++;
 
       }
 
       else if(i==10)
 
       {
 
           showText("神:だからお前に最強の力を与え、",300,50);
           showText("この世界を支配する魔王を倒させたのだ！",300,70);
           i++;
 
       }
 
       else if(i==11)
 
       {
 
           showText("神:そして今！お前の体を乗っ取り！",300,50);
           showText("この世界に君臨するのだ！！",300,70);
           i++;
 
       }
 
       else if(i==12)
 
       {
 
           showText("アノレノレ:そんな...！ど、どうしよう、",300,50);
           showText("ボクは...ボクは...！",300,70);
 
           i++;
 
       }
 
       else if(i==13)
 
       {
           if(theHero != null)
           {
               removeObject(theHero);
           }
           
           addObject(theHero, 75, 300 );
           
           theMaou = new maou();
           addObject(theMaou, 75, 150 );
           
           showText("魔王:...ウ...グッ...貴様の好きにはさせんぞおおお！！",300,50);
           showText("",300,70);
 
           i++;
 
       }
 
       else if(i==14)
 
       {
 
           showText("神:魔王！？お主...まだ生きておったか！！",300,50);
 
           i++;
 
       }
 
       else if(i==15)
 
       {
 
           showText("魔王:アノレノレ！貴様に我が闇の力を貸してやる！",300,50);
           showText("そこの邪神を打ち砕け！",300,70);
           i++;
 
       }
 
       else if(i==16)
 
       {
 
           showText("ア:魔王...！分かった！一緒に行こう！",300,50);
           showText("〜バトル3突入〜",300,70);
           i++;
 
       }
       
       else if(i==17)
       {
           i++;
           if(Greenfoot.isKeyDown("Space"))
           {
               Greenfoot.setWorld(new MyWorld2_3());
           }
           
       }
 
       
       
       
    
    
   }
       spaceWasDown = spaceDown;
   }
}


        
    

