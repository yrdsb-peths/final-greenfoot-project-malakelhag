import greenfoot.*;

public class LevelOne extends World {

    private boolean hasWon = false;

    public LevelOne() {
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("Level A.png");

        // Make the shadow layer darker
        GreenfootImage shadow = new GreenfootImage(background);
        shadow.setColor(new Color(0, 0, 0, 200)); // Darker shadow, adjust as needed
        shadow.fill();
        background.drawImage(shadow, 0, 0);

        setBackground(background);

        Rat rat = new Rat(300, 370, this); // Pass the LevelOne instance to the Rat
        rat.getImage().scale(60, 60);
        addObject(rat, 300, 370);

        // Add an instance of the X class
        X xMark = new X();
        xMark.getImage().scale(30, 30); // Adjust the scale as needed
        addObject(xMark, 300, 20); // Adjust position (x, y) as needed
    }

    public void act() {
        // Check if there are any objects of the Rat class in the world
        java.util.List<Rat> rats = getObjects(Rat.class);
        if (!rats.isEmpty()) {
            Rat rat = rats.get(0);
            rat.handleMovement();

            // Check for collision with the X mark
            if (rat.checkCollision(X.class) && !hasWon) {
                hasWon = true;
                handleWin(); // Call the method to handle the transition to the winner class
            }
        }
    }

    public boolean hasWon() {
        return hasWon;
    }

    public void handleWin() {
        removeObject(getObjects(X.class).get(0)); // Remove the X mark
        removeObject(getObjects(Rat.class).get(0)); // Remove the Rat

        Greenfoot.setWorld(new Winner1());
    }
}













