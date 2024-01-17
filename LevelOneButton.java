import greenfoot.*;

public class LevelOneButton extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelOne());
        }
    }
}
