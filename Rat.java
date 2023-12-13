import greenfoot.*;

public class Rat extends Actor {
    private int winningX; 
    private int winningY; 
    
    
    public Rat() {
        this.winningX = 0;
        this.winningY = 0;
    }
    
    public Rat(int winningX, int winningY) {
        this.winningX = winningX;
        this.winningY = winningY;
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
        Color wallColor = Color.BLACK; // Adjust based on your maze image

        // Check if we are within the world boundaries
        if (x >= 0 && x < getWorld().getWidth() && y >= 0 && y < getWorld().getHeight()) {
            Color pixelColor = getWorld().getBackground().getColorAt(x, y);
            return pixelColor.equals(wallColor);
        }

        // If outside the world boundaries, consider it a wall
        return true;
    }
    
    
    private void checkWin() {
        // Check if the rat is at the winning location
        if (getX() == winningX && getY() == winningY) {
            Greenfoot.stop(); // Stop the game
            System.out.println("Congratulations! You won!");
        }
    }
}


