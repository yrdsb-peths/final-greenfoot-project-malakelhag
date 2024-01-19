import greenfoot.*;

public class LevelFour2 extends World {

    private boolean hasWon = false;

    public LevelFour2() {
        super(1100, 1100, 1);
        GreenfootImage background = new GreenfootImage("LevelFour2.png");

        RatDot4 ratDot4 = new RatDot4(300, 370, this); 
        ratDot4.getImage().scale(30, 30);
        addObject(ratDot4, 1060, 1050);

        // Add an instance of the X class
        X4 xMark = new X4();
        xMark.getImage().scale(30, 30); // Adjust the scale as needed
        addObject(xMark, 30, 40); // Adjust position (x, y) as needed
    }

    public void act() {
        // Check if there are any objects of the Rat class in the world
        java.util.List<RatDot4> rats = getObjects(RatDot4.class);
        if (!rats.isEmpty()) {
            RatDot4 ratDot4 = rats.get(0);
            ratDot4.handleMovement();

            // Check for collision with the X mark
            if (ratDot4.checkCollision(X4.class) && !hasWon) {
                hasWon = true;
                handleWin(); // Call the method to handle the transition to the winner class
            }
        }
    }

    public boolean hasWon() {
        return hasWon;
    }

    public void handleWin() {
        removeObject(getObjects(X4.class).get(0)); // Remove the X mark
        removeObject(getObjects(RatDot4.class).get(0)); // Remove the Rat

        Greenfoot.setWorld(new Winner2());
    }
}