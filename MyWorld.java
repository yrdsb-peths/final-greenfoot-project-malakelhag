import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("Level A (1).png");
        setBackground(background);
        
        int[] winningXPositions = {290, 295, 315, 305, 310, 300}; 
        int[] winningYPositions = {15, 15, 15, 18, 18, 18}; 
        Rat rat = new Rat(winningXPositions, winningYPositions);
        rat.getImage().scale(60, 60);
        addObject(rat, 300, 370);

    }
}
