import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2_3 extends World
{
    private int timecount = 10000;
    /**
     * Constructor for objects of class MyWorld2_3.
     * 
     */
    // 分割数（3x3）と、パズルの総ピクセルサイズ（360x360）
            private static final int BOARD_N = 3;
            private static final int TILE_SIZE = 120;               // 120 * 3 = 360
            private static final int BOARD_PIX_W = BOARD_N * TILE_SIZE; // 360
            private static final int BOARD_PIX_H = BOARD_N * TILE_SIZE; // 360
            private static final int[][] CREAER_PATTERN ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 0} };
            private Tile[][] tilesGrid = new Tile[BOARD_N][BOARD_N];
            // 計算後に使うマージン（背景の中央に置くため）
            private int marginX;
            private int marginY;
        private GreenfootImage source; // 分割元画像（360x360にスケールして使用）
        private Tile emptyTile;
    
    public MyWorld2_3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage bg = new GreenfootImage("background.png");
        setBackground(bg);
        addObject( new hero2(), 50, 250 );
        
        int E = 1;
        E = 1 + E;
        
        if(E==2)
        {
            addObject( new enemy2(), 550, 250 );
        }
        
        if(E==3)
        {
            addObject( new maou2(), 550, 250 );
        }
        
        if(E==4)
        {
            addObject( new God2(), 550, 250 );
            E = 1;
        }
        
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
                // ここでは「生成を確認するため」9枚とも表示
                if(row==BOARD_N-1 && col==BOARD_N -1){
                    GreenfootImage blankImg = new GreenfootImage(TILE_SIZE,TILE_SIZE);
                    blankImg.setColor(Color.LIGHT_GRAY);
                    blankImg.fill();
                    blankImg.setColor(Color.BLACK);
                    blankImg.drawRect(0, 0, TILE_SIZE - 1, TILE_SIZE - 1);
                    
                    emptyTile = new Tile(0,blankImg);
                    emptyTile.setGridPosition(row,col);
                    
                   
                    int centerX = marginX + col * TILE_SIZE + TILE_SIZE / 2;
                    int centerY = marginY + row * TILE_SIZE + TILE_SIZE / 2;
                    addObject(emptyTile, centerX, centerY);
                    tilesGrid[BOARD_N -1][BOARD_N -1] = emptyTile;
                    continue; // 画像タイル生成はスキップ

                   
                }
                GreenfootImage tileImg = cutTileImage(col, row);
                Tile tile = new Tile(value, tileImg);
 
                tile.setGridPosition(row,col);
                // Actor は「中心座標」で置くので、+ TILE_SIZE/2 する
                int centerX = marginX + col * TILE_SIZE + TILE_SIZE / 2;
                int centerY = marginY + row * TILE_SIZE + TILE_SIZE / 2;
                addObject(tile, centerX, centerY);
                tilesGrid[row][col] = tile;
 
                value++;
            }
        }
 
        // 見栄え用：盤面の外枠（背景に描画）
        drawBoardFrame();
        showText("[Esc]で戻る", getWidth() / 2, getHeight() - 20);
        shuffleTiles();

      //   if(Greenfoot.mouseClicked(this)){
             
         //   int row =emptyTile.getGridRow();
        //    int col =emptyTile.getGridCol();
          //   java.util.List<Tile> neighbors = new java.util.ArrayList<>();
        //    if (row > 0) neighbors.add(tilesGrid[row-1][col]); // 上
         //   if (row < BOARD_N-1) neighbors.add(tilesGrid[row+1][col]); // 下
        //    if (col > 0) neighbors.add(tilesGrid[row][col-1]); // 左
         //   if (col < BOARD_N-1) neighbors.add(tilesGrid[row][col+1]); // 右
            //もし隣接でなければ無効にしたい
            
         //    swapTiles(emptyTile,this);
        // }
         

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
        for (int i = 0; i < 100; i++) {
            moveEmptyTileRandomly(); // 空タイルだけ動かす
            
        }           
    }
    private void moveEmptyTileRandomly() {
        Random rand = new Random();
        int row =emptyTile.getGridRow();
        int col =emptyTile.getGridCol();
         java.util.List<Tile> neighbors = new java.util.ArrayList<>();
        if (row > 0) neighbors.add(tilesGrid[row-1][col]); // 上
        if (row < BOARD_N-1) neighbors.add(tilesGrid[row+1][col]); // 下
        if (col > 0) neighbors.add(tilesGrid[row][col-1]); // 左
        if (col < BOARD_N-1) neighbors.add(tilesGrid[row][col+1]); // 右

        // ランダムに選んで入れ替え
        Tile t = neighbors.get(rand.nextInt(neighbors.size()));
        
        swapTiles(emptyTile,t);
    }
    
    private void swapTiles(Tile tileA, Tile tileB){
        int ax = tileA.getX(), ay = tileA.getY();
        int bx = tileB.getX(), by = tileB.getY();
        tileA.setLocation(bx,by);
        tileB.setLocation(ax,ay);
        
        int rowA =tileA.getGridRow(), colA = tileA.getGridCol();
        int rowB =tileB.getGridRow(), colB = tileB.getGridCol();
        
        tileA.setGridPosition(rowB,colB);
        tileB.setGridPosition(rowA,colA);
        
    }

    
 
    public void act()
    {
        timecount--;
        showText(""+timecount, 50,20 );
        if( timecount == 0 ){
           showText("TIME OVER", 300, 200);
           Greenfoot.stop();
       }
           handleTileClick(); // ←ここでクリック判定
}

private void handleTileClick() {
    if (Greenfoot.mouseClicked(null)) {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi == null) return;

        Actor clickedActor = mi.getActor();
        if (clickedActor instanceof Tile && clickedActor != emptyTile) {
            Tile clickedTile = (Tile) clickedActor;

            int rowDiff = Math.abs(clickedTile.getGridRow() - emptyTile.getGridRow());
            int colDiff = Math.abs(clickedTile.getGridCol() - emptyTile.getGridCol());

            if ((rowDiff == 1 && colDiff == 0) || (rowDiff == 0 && colDiff == 1)) {
                swapTiles(emptyTile, clickedTile);
            }
        }
    }
       

    }
    
    
    
    
}
