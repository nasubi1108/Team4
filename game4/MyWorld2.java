import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    private int timecount = 1000;
    private boolean canOperate = true;/////////////////
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    // 分割数（3x3）と、パズルの総ピクセルサイズ（360x360）
            private static final int BOARD_N = 3;
            private static final int TILE_SIZE = 120;               // 120 * 3 = 360
            private static final int BOARD_PIX_W = BOARD_N * TILE_SIZE; // 360
            private static final int BOARD_PIX_H = BOARD_N * TILE_SIZE; // 360
            // 計算後に使うマージン（背景の中央に置くため）
            private int marginX;
            private int marginY;
        private GreenfootImage source; // 分割元画像（360x360にスケールして使用）
    
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("background.png");
        setBackground(bg);
        
        addObject( new hero2(), 50, 250 );
        addObject( new maou2(), 550, 250 );
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        addObject( new hero(), 100, 250 );
        addObject( new maou(), 500, 250 );

        // 盤面を背景の中心に置くためのマージン（左上の始点）
        marginX = (getWidth()  - BOARD_PIX_W) / 2;
        marginY = (getHeight() - BOARD_PIX_H) / 2;
 
        // パズル元画像（350x350）を読み込み→360x360にスケール（均等120px分割のため）
        source = new GreenfootImage("Tile.png");
        source.scale(BOARD_PIX_W, BOARD_PIX_H);
 
        // タイルを 3x3 に分割して、背景中央に並べる（生成まで）
        int value = 1;
        for (int row = 0; row < BOARD_N; row++) {
            for (int col = 0; col < BOARD_N; col++) {
                // ここでは「生成を確認するため」9枚とも表示します。
                GreenfootImage tileImg = cutTileImage(col, row);
                Tile tile = new Tile(value, tileImg);
 
                // Actor は「中心座標」で置くので、+ TILE_SIZE/2 する
                int centerX = marginX + col * TILE_SIZE + TILE_SIZE / 2;
                int centerY = marginY + row * TILE_SIZE + TILE_SIZE / 2;
                addObject(tile, centerX, centerY);
 
                value++;
            }
        }
 
        // 見栄え用：盤面の外枠（背景に描画）
        drawBoardFrame();
        showText("[Esc]で戻る", getWidth() / 2, getHeight() - 20);
        shuffleTiles();
 
    }
    
    /** (col,row) の領域だけをタイル画像に切り出す */
    private GreenfootImage cutTileImage(int col, int row) {
        GreenfootImage img = new GreenfootImage(TILE_SIZE, TILE_SIZE);
        // source を負のオフセットで描く＝欲しい部分だけ取り込む
        img.drawImage(source, -col * TILE_SIZE, -row * TILE_SIZE);
 
        // 見やすい枠線
        img.setColor(Color.BLACK);
        img.drawRect(0, 0, TILE_SIZE - 1, TILE_SIZE - 1);
        return img;
    }
 
    /** 盤面の外枠を背景に描く（中央の360x360を囲む） */
    private void drawBoardFrame() {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.BLACK);
        bg.drawRect(marginX - 2, marginY - 2, BOARD_PIX_W + 4, BOARD_PIX_H + 4);
    }
 
    /** 簡易シャッフル：表示済みのタイルをランダムに並べ替える */
    private void shuffleTiles() {
        java.util.List<Tile> tiles = getObjects(Tile.class);
        java.util.Collections.shuffle(tiles); // ランダム順に並べ替え
        int idx = 0;
        for (int row = 0; row < BOARD_N; row++) {
            for (int col = 0; col < BOARD_N; col++) {
                Tile t = tiles.get(idx++);
                int centerX = marginX + col * TILE_SIZE + TILE_SIZE / 2;
                int centerY = marginY + row * TILE_SIZE + TILE_SIZE / 2;
                t.setLocation(centerX, centerY);
            }
        }
    }
 
 
    public void act()///////////////////
    {
       if(timecount > 0){
        timecount--;
       }
       else{
           canOperate = false;
       }
       showText("TIME: "+ timecount,getWidth()/2,20);
       if(timecount <= 0){
           if(Greenfoot.isKeyDown("space")){
           MyWorld.i = 8;
           Greenfoot.setWorld(new MyWorld_T());
        }
       }
    }
    public boolean canOperate()
    {
        return canOperate;
    }
}
