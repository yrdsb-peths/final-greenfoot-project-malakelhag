import greenfoot.*;

public class LevelThree2 extends World {

    private boolean hasWon = false;

    public LevelThree2() {
        super(850, 850, 1);
        GreenfootImage background = new GreenfootImage("LevelThree2.png");

        RatDot3 ratDot3 = new RatDot3(300, 370, this); 
        ratDot3.getImage().scale(20, 20);
        addObject(ratDot3, 810, 795);

        // Add an instance of the X class
        X3 xMark = new X3();
        xMark.getImage().scale(30, 30); // Adjust the scale as needed
        addObject(xMark, 30, 40); // Adjust position (x, y) as needed
    }

    public void act() {
        // Check if there are any objects of the Rat class in the world
        java.util.List<RatDot3> rats = getObjects(RatDot3.class);
        if (!rats.isEmpty()) {
            RatDot3 ratDot3 = rats.get(0);
            ratDot3.handleMovement();

            // Check for collision with the X mark
            if (ratDot3.checkCollision(X3.class) && !hasWon) {
                hasWon = true;
                handleWin(); // Call the method to handle the transition to the winner class
            }
        }
    }

    public boolean hasWon() {
        return hasWon;
    }

    public void handleWin() {
        removeObject(getObjects(X3.class).get(0)); // Remove the X mark
        removeObject(getObjects(RatDot3.class).get(0)); // Remove the Rat

        Greenfoot.setWorld(new Winner2());
    }
}