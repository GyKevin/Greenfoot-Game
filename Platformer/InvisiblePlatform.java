import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvisiblePlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisiblePlatform extends Actor
{
    /**
     * Act - do whatever the InvisiblePlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public InvisiblePlatform() {
    this(100, 15);
    }
    public InvisiblePlatform(int width, int height) {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
