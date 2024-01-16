import greenfoot.*;

public class BackButtonForEdition extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
