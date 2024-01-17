import greenfoot.*;

public class ChooseEdition extends World {
    public ChooseEdition() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        BackButtonForEdition backButton = new BackButtonForEdition();
        addObject(backButton, 100, 350);

        MazeOneButton mazeOneButton = new MazeOneButton();
        addObject(mazeOneButton, 170, 230);

        MazeTwoButton mazeTwoButton = new MazeTwoButton();
        addObject(mazeTwoButton, 420, 230);
    }

}
