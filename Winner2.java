import greenfoot.*;

public class Winner2 extends World {
    public Winner2() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        HomeButtonWinner2 homeButton = new HomeButtonWinner2();
        addObject(homeButton, 100, 350);

        NextButtonWinner2 nextButton = new NextButtonWinner2();
        addObject(nextButton, 500, 340);
        
    }

}
