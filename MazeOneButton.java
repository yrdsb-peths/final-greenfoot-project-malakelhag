import greenfoot.*;

public class MazeOneButton extends Actor {
    private boolean isMouseOver = false;

    public void act() {
        checkMouseOver();

        if (Greenfoot.mousePressed(this)) {
            if (isMouseOver) {
                getWorld().showText("MazeOneButton clicked!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                Greenfoot.setWorld(new SolvingMaze1());
            }
        }
    }

    private void checkMouseOver() {
        if (Greenfoot.mouseMoved(null)) {
            isMouseOver = Greenfoot.mouseMoved(this);
        }
    }
}
