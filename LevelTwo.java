import greenfoot.*;  

public class LevelTwo extends World {
    public LevelTwo() {
        super(600, 400, 1);
        Rat2 rat2 = new Rat2(300, 370, this); 
        rat2.getImage().scale(50, 50);
        addObject(rat2, 430, 380);
        
        
        // idk why a blank image is showing up instead of Level b
    }
}
