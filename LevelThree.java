import greenfoot.*;  

public class LevelThree extends World {
    public LevelThree() {
        super(600, 400, 1);
        Rat3 rat3 = new Rat3(300, 370, this); 
        rat3.getImage().scale(50, 50);
        addObject(rat3, 480, 380);
    }
}

