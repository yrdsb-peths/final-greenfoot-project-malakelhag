import greenfoot.*;

public class NextButtonWinner1 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new SolvingMaze1());
        }
    }
}
