import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightSpike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightSpike extends Actor
{
    /**
     * Act - do whatever the RightSpike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForCharacter();
        lookForActor();
    }    
        public void lookForActor(){
        Actor actor;
        actor = getOneObjectAtOffset(0,0, Actor.class);
    }
    public void lookForCharacter(){
        Actor character;
        character = getOneObjectAtOffset(1,1,Character.class);
        if(character != null) {
            getWorld().removeObject(character);
            Greenfoot.stop();
            getWorld().addObject(new GameOver(),800,450);
        }
    }
}
