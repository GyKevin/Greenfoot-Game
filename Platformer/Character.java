
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int GRAVITY = 1;
    private final int STEP = 5;
    private int velocity;
    private int collect = 0;
    boolean TenCoinsCollected = false;
    public Character() {
        velocity = 0;
    }
    public void act() 
    {
        fall();
        if(Greenfoot.isKeyDown("space") && isOnSolidGround()) jump();
        move();
        collectCoin();
    }
    public void fall() {
        setLocation(getX(),getY() + velocity);
        if(isOnSolidGround()) {
           velocity = 0;
           
           while(isOnSolidGround()) {
               setLocation(getX(), getY() -1);
            }
            setLocation(getX(), getY() +1);
        }
        else if(velocity< 0 && didBumpHead()) { 
           velocity = 0;
           while(didBumpHead()) {
            setLocation(getX(), getY() +1);
            }
        }
        else velocity += GRAVITY;
    }
    public void jump() {
        velocity = -15;
    }
    public void move(){
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("a") && canMoveLeft()) x-= STEP;
        if(Greenfoot.isKeyDown("d") && canMoveRight()) x+= STEP;
        setLocation(x,y);
    }
    public boolean isOnSolidGround() {
        boolean isOnGround = false;
        if(getY() > getWorld().getHeight() -50) isOnGround = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform.class) != null || 
           getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform.class) != null ||
           getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, InvisiblePlatform.class) != null ||
           getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, InvisiblePlatform.class) != null)
        isOnGround = true;
        
        return isOnGround;
    }
    public boolean didBumpHead(){
        boolean bumpedHead = false;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, Platform.class) != null || 
           getOneObjectAtOffset(imageWidth / 2, imageHeight / -2, Platform.class) != null)
           bumpedHead = true;
           
           return bumpedHead;
    }
    public boolean canMoveLeft(){
        boolean canMoveLeft = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if(getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / -2, Platform.class) != null || 
           getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / 2 -1, Platform.class) != null ||
           getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / -2, InvisiblePlatform.class) != null ||
           getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / 2 -1, InvisiblePlatform.class) != null)
           canMoveLeft = false;
           
        return canMoveLeft;
    }
    public boolean canMoveRight(){
        boolean canMoveLeft = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if(getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / -2, Platform.class) != null || 
           getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / 2 -1, Platform.class) != null ||
           getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / -2, InvisiblePlatform.class) != null || 
           getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / 2 -1, InvisiblePlatform.class) != null)
           canMoveLeft = false;
           
        return canMoveLeft;
    }
        public void collectCoin(){
        Actor coin = getOneIntersectingObject(Coin.class);
        if(coin!=null){
            getWorld().removeObject(coin);
            collect++;
        }
        if(collect==10 && TenCoinsCollected==false){
            getWorld().addObject(new Portal(), 1300, 650);
            TenCoinsCollected = true;
        }
    }
    public void endGame() {
        Actor Portal = getOneIntersectingObject(Portal.class);
        if(Portal!=null){
            getWorld().addObject(new MissionComplete(),800,450);
            Greenfoot.stop();
        }
    }
}
