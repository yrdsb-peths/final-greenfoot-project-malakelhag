import greenfoot.*;

public class SolvingMaze2 extends World {
    public SolvingMaze2() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        BackButtonMaze2 backButton = new BackButtonMaze2();
        addObject(backButton, 100, 350);
        
        LevelOneButton2 levelOneButton2 = new LevelOneButton2();
        addObject(levelOneButton2, 300, 200);
        
        LevelTwoButton2 levelTwoButton2 = new LevelTwoButton2();
        addObject(levelTwoButton2, 300, 250);
        
        LevelThreeButton2 levelThreeButton2 = new LevelThreeButton2();
        addObject(levelThreeButton2, 300, 300);
        
        LevelFourButton2 levelFourButton2 = new LevelFourButton2();
        addObject(levelFourButton2, 300, 350);
        
        

    }

}

