import greenfoot.*;

public class Rat extends Actor {
    private int[] winningXPositions;
    private int[] winningYPositions;

    public Rat() {
        GreenfootImage image = getImage();
        int newWidth = 20;
        int newHeight = 20;
        image.scale(newWidth, newHeight);
        setImage(image);
    }

    public Rat(int[] winningXPositions, int[] winningYPositions) {
        this.winningXPositions = winningXPositions;
        this.winningYPositions = winningYPositions;
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
            Greenfoot.setWorld(new Winner());
        } else {
            for (int i = 0; i < winningXPositions.length; i++) {
                if (getX() == winningXPositions[i] && getY() == winningYPositions[i]) {
                    Greenfoot.setWorld(new Winner());
                    break;
                }
            }
        }
    }
}
