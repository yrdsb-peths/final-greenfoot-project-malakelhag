import greenfoot.*;

public class Rat3 extends Actor {
    private int initialX;
    private int initialY;
    private LevelThree world; 

    public Rat3(int initialX, int initialY, LevelThree world) {
        this.initialX = initialX;
        this.initialY = initialY;
        this.world = world; // 
        setLocation(initialX, initialY);
        GreenfootImage image = getImage();
        setImage(image);
    }

    public void act() {
        handleMovement();
        checkIfWon();
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
        int sensitivity = 10; 
    
        if (x >= 0 && x < getWorld().getWidth() && y >= 0 && y < getWorld().getHeight()) {
            Color pixelColor = getWorld().getBackground().getColorAt(x, y);
    
            int diffRed = Math.abs(pixelColor.getRed() - wallColor.getRed());
            int diffGreen = Math.abs(pixelColor.getGreen() - wallColor.getGreen());
            int diffBlue = Math.abs(pixelColor.getBlue() - wallColor.getBlue());
    
            return (diffRed + diffGreen + diffBlue) < sensitivity;
        }
    
        return true;
    }

    
    public void checkIfWon() {
        int x = getX();
        int y = getY();

        Color redColor = Color.RED;

        if (x >= 0 && x < getWorld().getWidth() && y >= 0 && y < getWorld().getHeight()) {
            Color pixelColor = getWorld().getBackground().getColorAt(x, y);

            if (pixelColor.equals(redColor)) {
                youWon();
            }
        }
    }

    public void youWon() {
        Winner2 winner2 = new Winner2(); 
        Greenfoot.setWorld(winner2);
    }

}
