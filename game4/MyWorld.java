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
       if(Greenfoot.isKeyDown("Z"))
       {
           Greenfoot.setWorld(new MyWorld2());
        }
        
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
           addObject( new God(), 500, 250 );
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
           removeObject( new God() );
           addObject( new enemy(), 500, 250 );
           showText("神:では早速あのモンスターを倒すのじゃ！",300,50);
           showText("（バトル１突入)",300,70);
           i++;
       }

       //バトル１を開始
       //バトル１をクリア
       else if(i==8)
       {
           showText("アノレノレ:やった、楽勝だね！もうどんな敵も怖くないや！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==9)
       {
           showText("神:ワシが最強の力を授けたからのう！",300,50);
           showText("では、魔王を討伐してもらうとしよう...",300,70);
           i++;
       }
       else if(i==10)
       {
           showText("アノレノレ:任せてよ！長い旅になったとしても",300,50);
           showText("必ず倒してみせる！",300,70);
           i++;
       }
       else if(i==11)
       {
           showText("神:そんなものは待ってられん！！授けた力は長くは続かん！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==12)
       {
           showText("神:今ここで魔王を召喚する！！",300,50);
           i++;
       }
       else if(i==13)
       {
           showText("アノレノレ:えええええええ！？いきなり！？",300,50);
           showText("というかそんなことできるの！？",300,70);
           i++;
       }
       else if(i==14)
       {
           showText("神:問答無用じゃ！！むむむ...カアアア！！",300,50);
           showText("",300,70);
           i++;
       }
       else if(i==15)
       {
           showText("アノレノレ:ちょっと待ってよ！まだ心の準備が！",300,50);
           showText("うわあああああああああ！！(バトル２突入)",300,70);
           i++;
       }
       //バトル２突入
       //バトル２終了
       else if(i==16)
 
       {
 
           showText("アノレノレ:やったああああ！！なんとか魔王を倒せたぞ！",300,50);
           showText("",300,70);
           i++;
 
       }
 
       else if(i==17)
 
       {
 
           showText("神: .....。",300,50);
 
           i++;
 
       }
 
       else if(i==18)
 
       {
 
           showText("アノレノレ: ...？これで世界を救えたんだよね！",300,50);
 
           i++;
 
       }
 
       else if(i==19)
 
       {
 
           showText("神:フフフ......ハハハハハハ！",300,70);
 
           i++;
 
       }
 
       else if(i==20)
 
       {
 
           showText("アノレノレ:どう...したの？神様...？",300,50);
           showText("",300,70);
 
           i++;
 
       }
 
       else if(i==21)
 
       {
 
           showText("神:バカめ！まんまと騙されおって！！",300,50);
 
           i++;
 
       }
 
       else if(i==22)
 
       {
 
           showText("神:これで世界はワシのものじゃあああああああああ！！",300,50);
 
           i++;
 
       }
 
       else if(i==23)
 
       {
 
           showText("アノレノレ:な...なに...？どういうこと...？",300,50);
 
           i++;
 
       }
 
       else if(i==24)
 
       {
 
           showText("神:はぁ...いいだろう、冥土の土産に教えてやるぞい！",300,50);
 
           i++;
 
       }
 
       else if(i==25)
 
       {
 
           showText("神:ワシはこの素晴らしい世界を支配したかった...",300,50);
           showText("だが下界には直接干渉できない！",300,70);
           i++;
 
       }
 
       else if(i==26)
 
       {
 
           showText("神:だからお前に最強の力を与え、",300,50);
           showText("この世界を支配する魔王を倒させたのだ！",300,70);
           i++;
 
       }
 
       else if(i==27)
 
       {
 
           showText("神:そして今！お前の体を乗っ取り！",300,50);
           showText("この世界に君臨するのだ！！",300,70);
           i++;
 
       }
 
       else if(i==28)
 
       {
 
           showText("アノレノレ:そんな...！ど、どうしよう、",300,50);
           showText("ボクは...ボクは...！",300,70);
 
           i++;
 
       }
 
       else if(i==29)
 
       {
 
           showText("魔王:...ウ...グッ...貴様の好きにはさせんぞおおお！！",300,50);
           showText("",300,70);
 
           i++;
 
       }
 
       else if(i==30)
 
       {
 
           showText("神:魔王！？お主...まだ生きておったか！！",300,50);
 
           i++;
 
       }
 
       else if(i==31)
 
       {
 
           showText("魔王:アノレノレ！貴様に我が闇の力を貸してやる！",300,50);
           showText("そこの邪神を打ち砕け！",300,70);
           i++;
 
       }
 
       else if(i==32)
 
       {
 
           showText("ア:魔王...！分かった！一緒に行こう！",300,50);
           showText("〜バトル3突入〜",300,70);
           i++;
 
       }
 
       else if(i==33)
 
       {
 
           showText("神:ぐあああああ！魔力が...！身体が保てない！！",300,50);
           showText("",300,70);
           i++;
 
       }
 
       else if(i==34)
 
       {
 
           showText("魔王:終わりだ！邪神よ！俺とともに地獄へ墜ちろ！",300,50);
 
           i++;
 
       }
 
       else if(i==35)
 
       {
 
           showText("アノレノレ:魔王！？何をするつもり！？",300,50);
 
           i++;
 
       }
 
       else if(i==36)
 
       {
 
           showText("魔王:アノレノレ...俺の最後の闇の力で神を存在ごと消す！",300,50);
 
           i++;
 
       }
 
       else if(i==37)
 
       {
 
           showText("魔王:このぶよぶよ界を託したぞ！",300,50);
 
           i++;
 
       }
 
       else if(i==38)
 
       {
 
           showText("アノレノレ:魔王！う、うわああああああああああ！！",300,50);
 
           i++;
 
       }
 
       else if(i==39)
 
       {
 
           showText("アノレノレ:...ふ、二人とも消えちゃった...",300,50);
 
           i++;
 
       }
 
       else if(i==40)
 
       {
 
           showText("ア:でもこれで世界は平和になったね！",300,50);
 
           showText("今日から鍛え直さなきゃ！頑張るぞぉ〜！",300,70);
 
           i++;
 
       }
 
       else if(i==41)
 
       {
 
           showText("終",300,50);
 
           showText("",300,70);
 
           i++;
 
       }
       
   }
       spaceWasDown = spaceDown;
   }
   
   
    
}
