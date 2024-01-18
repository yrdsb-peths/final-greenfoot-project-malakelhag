import greenfoot.*;

public class MazeTwoButton extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {

            Greenfoot.setWorld(new SolvingMaze2());
        }
    }
}
