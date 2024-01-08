import greenfoot.*;  

public class LevelThree extends World {
    public LevelThree() {
        super(900, 900, 1);
        GreenfootImage background = new GreenfootImage("Bigger.png");
        setBackground(background);

        Rat rat = new Rat(800, 800); 
        rat.getImage().scale(50, 50);
        addObject(rat, 451, 451);
        
        /// will change the picture soon.
    }
}
