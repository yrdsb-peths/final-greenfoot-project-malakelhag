import greenfoot.*;  

public class LevelTwo extends World {
    public LevelTwo() {
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("Second.png");
        setBackground(background);

        Rat rat = new Rat(100, 200); 
        rat.getImage().scale(60, 60);
        addObject(rat, 490, 370);
    }
}
