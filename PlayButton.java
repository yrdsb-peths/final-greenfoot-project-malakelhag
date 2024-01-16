import greenfoot.*;

public class PlayButton extends Actor {
    public PlayButton() {
        // Load the smaller image
        GreenfootImage smallerImage = new GreenfootImage("try4.png");
        
        // Scale the image to make it bigger
        GreenfootImage biggerImage = new GreenfootImage(smallerImage.getWidth() * 2, smallerImage.getHeight() * 2);
        biggerImage.drawImage(smallerImage, 0, 0);
        
        // Set the scaled image to the actor
        setImage(biggerImage);
    }

    public void act() {

        if (Greenfoot.mouseClicked(this)) {
            // Perform actions when the button is clicked
            Greenfoot.setWorld(new ChooseEdition()); // Transition to ChooseEdition class
        }
}
}

