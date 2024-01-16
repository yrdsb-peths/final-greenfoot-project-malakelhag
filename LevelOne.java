import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public LevelOne()
    {    
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("LevelA.png");
        setBackground(background);

        Rat rat = new Rat(300, 370);
        rat.getImage().scale(60, 60);
        addObject(rat, 300, 370);
    }
}
