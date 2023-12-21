import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("Red one.png");
        setBackground(background);

        Rat rat = new Rat(300, 370);
        rat.getImage().scale(60, 60);
        addObject(rat, 300, 370);
    }
}

