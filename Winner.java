import greenfoot.*;

public class Winner extends World {
    private Class<? extends World> nextLevelClass;

    public Winner() {
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("WinnerS.png");
        setBackground(background);
    }

    public Winner(String nextLevelBackground, Class<? extends World> nextLevelClass) {
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage(nextLevelBackground);
        setBackground(background);
        this.nextLevelClass = nextLevelClass;
    }

    public void act() {
        checkStartKey();
    }

    private void checkStartKey() {
        if (Greenfoot.isKeyDown("space")) {
            if (nextLevelClass != null) {
                try {
                    Greenfoot.setWorld(nextLevelClass.getDeclaredConstructor().newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

