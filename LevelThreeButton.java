import greenfoot.*;

public class LevelThreeButton extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelThree());
        }
    }
}