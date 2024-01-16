import greenfoot.*;

public class ChooseEdition extends World {
    public ChooseEdition() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        BackButtonForEdition backButton = new BackButtonForEdition();
        addObject(backButton, getWidth() / 2, getHeight() / 2);

        MazeOneButton mazeOneButton = new MazeOneButton();
        addObject(mazeOneButton, getWidth() / 2, getHeight() / 2);

        MazeTwoButton mazeTwoButton = new MazeTwoButton();
        addObject(mazeTwoButton, 400, 230);
    }

}
