import greenfoot.*;
 
public class Tile extends Actor {
    private final int value;
    private int row;
    private int col;
 
    public Tile(int value, GreenfootImage img) {
        this.value = value;
        setImage(img);
    }
 
    public int getValue() { return value; }
    
    public void setGridPosition(int row, int col){
        this.row = row;
        this.col = col;
    }
    public int getGridRow(){ return row;}
    public int getGridCol(){ return col;}
}