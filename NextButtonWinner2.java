import greenfoot.*;

public class NextButtonWinner2 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new SolvingMaze2());
        }
    }
}
