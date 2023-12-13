import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("Level A.png");
        setBackground(background);
        
        int winningX = 300;
        int winningY = 395;
        Rat rat = new Rat();
        addObject(rat, getWidth() / 2, getHeight() / 2); // Place Rat in the center of the world
    }
}
