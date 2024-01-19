import greenfoot.*;

public class Score extends Actor {
    private int score;
    private int totalCheese;

    public Score() {
        score = 0;
        totalCheese = 0;
    }

    public void act() {
        // Your implementation for Score class goes here
    }

    public void updateScore(int currentScore, int totalCheese) {
        this.score = currentScore;
        this.totalCheese = totalCheese;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage("Score: " + score + "/" + totalCheese, 20, Color.BLACK, Color.WHITE);
        setImage(image);
    }
}
