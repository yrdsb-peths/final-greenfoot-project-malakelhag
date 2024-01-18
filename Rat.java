import greenfoot.*;

public class Rat extends Actor {
    private int initialX;
    private int initialY;
    private LevelOne world; // Reference to the LevelOne world

    public Rat(int initialX, int initialY, LevelOne world) {
        this.initialX = initialX;
        this.initialY = initialY;
        this.world = world; // Set the reference to the LevelOne world
        setLocation(initialX, initialY);
        GreenfootImage image = getImage();
        setImage(image);
    }

    public void act() {
        handleMovement();
        checkWin();
    }

    public void handleMovement() {
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

    public boolean checkCollision(Class<?> cls) {
        return isTouching(cls);
    }

    private boolean isAboveWall(int x, int y) {
        Color wallColor = Color.BLACK;

        if (x >= 0 && x < getWorld().getWidth() && y >= 0 && y < getWorld().getHeight()) {
            Color pixelColor = getWorld().getBackground().getColorAt(x, y);
            return pixelColor.equals(wallColor);
        }

        return true;
    }

    private void checkWin() {
        if (checkCollision(X.class) && !world.hasWon()) {
            world.handleWin(); // Call the method to handle the transition to the winner class
        }
    }
}





