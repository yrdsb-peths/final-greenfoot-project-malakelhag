import greenfoot.*;

public class CircleActor extends Actor {

    public CircleActor() {
        GreenfootImage image = new GreenfootImage(40, 40);
        drawTransparentCircle(image);
        setImage(image);
    }

    private void drawTransparentCircle(GreenfootImage image) {
        int radius = Math.min(image.getWidth(), image.getHeight()) * 2;
        int centerX = image.getWidth() * 2;
        int centerY = image.getHeight() * 2;
    
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
                if (distance <= radius) {
                    int alpha = (int) (255 * (1 - distance / radius));
                    image.setColor(new Color(0, 0, 0, alpha));
                    image.fillRect(x, y, 1, 1);
                }
            }
        }
}


    public void act() {
        // No need for any specific behavior, as it's just a visual element
    }
}




