import greenfoot.*;

public class LevelFourButton2 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelOne());
        }
    }
}