# Final Greenfoot Project
This is the README.md file.

In my game, you have a rat trying to solve a maze, there are two editions, solving maze 1 and solving maze 2. In solving maze 1 there are 3 Levels, and in Solving maze 2 there are 4 levels, which are way harder, and have a different look. I designed all of the mazes.

Arrays can be found in multiple classes, for example,
- In the LevelOne class, an ArrayList (java.util.List<Rat> rats) is used to store instances of the Rat class:
java.util.List<Rat> rats = getObjects(Rat.class);
- In the LevelOne class, an array (Rat rat = rats.get(0);) is used to access the first element of the rats list:
Rat rat = rats.get(0);
- In the MyWorld class, an array (GreenfootImage[]) is used to store the images for the play button:
GreenfootImage[] playButtonImages = new GreenfootImage[3];


There are some empty classes (ex: Circle, or GoodCheese) I would like to keep them because I will keep on editing the game after the class assignment is done. The Circle class, for example, was supposed to be a transparent circle surrounding the rat everywhere it goes, and acting as a view field, while the outside of the circle is all black, I couldn't manage to figure out how to do it tho, as I tried multiple ways, so I will continue to discover later.


- also I am not sure why my level 2 & 3 images in solving maze 1 don't show up when viewed from my classmate's laptop. it shows up fine in mine.

