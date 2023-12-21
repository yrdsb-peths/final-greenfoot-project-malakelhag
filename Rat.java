import greenfoot.*;

import greenfoot.*;

public class Rat extends Actor {
    private int initialX;
    private int initialY;

    public Rat(int initialX, int initialY) {
        this.initialX = initialX;
        this.initialY = initialY;
        setLocation(initialX, initialY);
        GreenfootImage image = getImage();
        setImage(image);
    }

    public void act() {
        handleMovement();
        checkWin();
    }

    private void handleMovement() {
        int x = getX();
        int y = getY();

        if (Greenfoot.isKeyDown("up") && !isAboveWall(x, y - 1)) {
            setLocation(x, y - 1);
        } else if (Greenfoot.isKeyDown("down") && !isAboveWall(x, y + 1)) {
            setLocation(x, y + 1);
        } else if (Greenfoot.isKeyDown("left") && !isAboveWall(x - 1, y)) {
            setLocation(x - 1, y);
        } else if (Greenfoot.isKeyDown("right") && !isAboveWall(x + 1, y)) {
            setLocation(x + 1, y);
        }
    }

    private boolean isAboveWall(int x, int y) {
        Color wallColor = Color.BLACK;

        if (x >= 0 && x < getWorld().getWidth() && y >= 0 && y < getWorld().getHeight()) {
            Color pixelColor = getWorld().getBackground().getColorAt(x, y);
            return pixelColor.equals(wallColor);
        }

        return true;
    }

    private boolean isOnMarker() {
        int x = getX();
        int y = getY();

        Color markerColor = Color.RED;
        Color pixelColor = getWorld().getBackground().getColorAt(x, y);

        return pixelColor.equals(markerColor);
    }

    private void checkWin() {
        if (isOnMarker()) {
            if (getWorld() instanceof MyWorld) {
                Greenfoot.setWorld(new Winner("WinnerS.png", LevelTwo.class));
            } else if (getWorld() instanceof LevelTwo) {
                Greenfoot.setWorld(new Winner("WinnerS.png", LevelThree.class));
            } else if (getWorld() instanceof LevelThree) {
                Greenfoot.setWorld(new Winner("Bigger.png", null));
            }
        }
    }



}
