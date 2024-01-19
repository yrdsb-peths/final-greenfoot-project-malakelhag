import greenfoot.*;

public class LevelTwo2 extends World {

    private boolean hasWon = false;

    public LevelTwo2() {
        super(600, 600, 1);
        GreenfootImage background = new GreenfootImage("LevelTwo2.png");

        RatDot2 ratDot2 = new RatDot2(300, 370, this); 
        ratDot2.getImage().scale(30, 30);
        addObject(ratDot2, 560, 540);

        // Add an instance of the X class
        X2 xMark = new X2();
        xMark.getImage().scale(30, 30); // Adjust the scale as needed
        addObject(xMark, 25, 40); // Adjust position (x, y) as needed
    }

    public void act() {
        // Check if there are any objects of the Rat class in the world
        java.util.List<RatDot2> rats = getObjects(RatDot2.class);
        if (!rats.isEmpty()) {
            RatDot2 ratDot2 = rats.get(0);
            ratDot2.handleMovement();

            // Check for collision with the X mark
            if (ratDot2.checkCollision(X2.class) && !hasWon) {
                hasWon = true;
                handleWin(); // Call the method to handle the transition to the winner class
            }
        }
    }

    public boolean hasWon() {
        return hasWon;
    }

    public void handleWin() {
        removeObject(getObjects(X2.class).get(0)); // Remove the X mark
        removeObject(getObjects(RatDot2.class).get(0)); // Remove the Rat

        Greenfoot.setWorld(new Winner2());
    }
}

