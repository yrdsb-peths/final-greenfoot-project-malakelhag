import greenfoot.*;

public class BackButtonMaze2 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new ChooseEdition());
        }
    }
}
