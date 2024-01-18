import greenfoot.*;

public class SolvingMaze1 extends World {
    public SolvingMaze1() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        BackButtonMaze1 backButton = new BackButtonMaze1();
        addObject(backButton, 100, 350);
        
        LevelOneButton levelOneButton = new LevelOneButton();
        addObject(levelOneButton, 300, 200);
        
        LevelTwoButton levelTwoButton = new LevelTwoButton();
        addObject(levelTwoButton, 300, 250);
        
        LevelThreeButton levelThreeButton = new LevelThreeButton();
        addObject(levelThreeButton, 300, 300);

        
    }

}

