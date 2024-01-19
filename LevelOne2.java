import greenfoot.*;

public class LevelOne2 extends World {

    private boolean hasWon = false;

    public LevelOne2() {
        super(330, 330, 1);
        GreenfootImage background = new GreenfootImage("LevelOne2.png");

        RatDot1 ratDot1 = new RatDot1(300, 370, this); 
        ratDot1.getImage().scale(20, 20);
        addObject(ratDot1, 300, 280);

        // Add an instance of the X class
        X1 xMark = new X1();
        xMark.getImage().scale(30, 30); // Adjust the scale as needed
        addObject(xMark, 20, 40); // Adjust position (x, y) as needed
    }

    public void act() {
        // Check if there are any objects of the Rat class in the world
        java.util.List<RatDot1> rats = getObjects(RatDot1.class);
        if (!rats.isEmpty()) {
            RatDot1 ratDot1 = rats.get(0);
            ratDot1.handleMovement();

            // Check for collision with the X mark
            if (ratDot1.checkCollision(X1.class) && !hasWon) {
                hasWon = true;
                handleWin(); // Call the method to handle the transition to the winner class
            }
        }
    }

    public boolean hasWon() {
        return hasWon;
    }

    public void handleWin() {
        removeObject(getObjects(X1.class).get(0)); // Remove the X mark
        removeObject(getObjects(RatDot1.class).get(0)); // Remove the Rat

        Greenfoot.setWorld(new Winner2());
    }
}
