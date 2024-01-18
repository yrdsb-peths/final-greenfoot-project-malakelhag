import greenfoot.*;

public class LevelOneButton2 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelOne());
        }
    }
}
