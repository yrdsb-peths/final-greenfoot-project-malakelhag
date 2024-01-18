import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        PlayButton playButton = new PlayButton();
        playButton.getImage().scale(400, 200);
        int x = 250;
        int y = 300;
        addObject(playButton, x, y); 
    }
}


