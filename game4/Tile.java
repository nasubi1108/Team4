import greenfoot.*;
 
public class Tile extends Actor {
    private final int value;
 
    public Tile(int value, GreenfootImage img) {
        this.value = value;
        setImage(img);
    }
 
    public int getValue() { return value; }
}