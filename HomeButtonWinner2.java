import greenfoot.*;

public class HomeButtonWinner2 extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
