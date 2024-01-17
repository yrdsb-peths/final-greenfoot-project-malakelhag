import greenfoot.*;

public class LevelTwoButton extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelOne());
        }
    }
}