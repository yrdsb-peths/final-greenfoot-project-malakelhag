import greenfoot.*;

public class LevelThreeButton2 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelOne());
        }
    }
}