import greenfoot.*;

public class BackButtonMaze1 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new ChooseEdition());
        }
    }
}
