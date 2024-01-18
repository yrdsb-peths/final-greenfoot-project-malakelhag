import greenfoot.*;

public class Winner1 extends World {
    public Winner1() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        HomeButtonWinner1 homeButton = new HomeButtonWinner1();
        addObject(homeButton, 100, 350);

        NextButtonWinner1 nextButton = new NextButtonWinner1();
        addObject(nextButton, 500, 340);
        
    }

}
