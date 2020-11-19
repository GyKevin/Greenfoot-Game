import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Character character = new Character();
        Saw saw5 = new Saw();
        addObject(saw5,910,541);
        Saw saw4 = new Saw();
        addObject(saw4,545,430);
        Saw saw2 = new Saw();
        addObject(saw2,98,624);
        Saw saw3 = new Saw();
        addObject(saw3,179,503);
        Saw saw = new Saw();
        addObject(saw,587,752);
        Platform platform = new Platform(2000, 30);
        addObject(platform,726,868);
        platform.setLocation(735,884);
        addObject(character,11,842);
        cloud cloud = new cloud();
        addObject(cloud,1325,144);
        cloud.setLocation(1391,94);
        cloud cloud2 = new cloud();
        addObject(cloud2,926,101);
        cloud2.setLocation(817,87);
        cloud cloud3 = new cloud();
        addObject(cloud3,359,70);
        cloud3.setLocation(324,73);
        cloud cloud4 = new cloud();
        addObject(cloud4,549,210);
        cloud4.setLocation(563,217);
        cloud cloud5 = new cloud();
        addObject(cloud5,1112,217);
        cloud5.setLocation(1158,234);
        Platform platform2 = new Platform(300, 50);
        addObject(platform2,298,810);
        platform2.setLocation(298,854);
        Platform platform3 = new Platform(100, 50);
        addObject(platform3,565,746);
        platform3.setLocation(508,780);
        platform3.setLocation(549,782);
        Platform platform4 = new Platform(50, 300);
        addObject(platform4,626,670);
        platform4.setLocation(620,657);
        Platform platform5 = new Platform(100, 50);
        addObject(platform5,519,523);
        platform5.setLocation(546,532);
        Platform platform6 = new Platform(200, 50);
        addObject(platform6,311,712);
        platform6.setLocation(311,750);
        Platform platform7 = new Platform(200, 100);
        addObject(platform7,400,600);
        platform7.setLocation(400,600);
        Platform platform8 = new Platform(200, 50);
        addObject(platform8,236,603);
        platform8.setLocation(200,625);
        Platform platform9 = new Platform(50, 50);
        addObject(platform9,100,752);
        platform9.setLocation(122,746);
        Platform platform10 = new Platform(50, 50);
        addObject(platform10,16,698);
        platform10.setLocation(25,686);
        Platform platform11 = new Platform(50, 50);
        addObject(platform11,180,475);
        Platform platform12 = new Platform(1000, 50);
        addObject(platform12,937,456);
        platform12.setLocation(1154,410);
        Platform platform13 = new Platform(100, 50);
        addObject(platform13,811,566);
        platform13.setLocation(758,566);
        Platform platform14 = new Platform(50, 100);
        addObject(platform14,843,617);
        platform14.setLocation(833,641);
        Platform platform15 = new Platform(50, 100);
        addObject(platform15,887,662);
        platform15.setLocation(874,678);
        platform15.setLocation(881,686);
        Platform platform16 = new Platform(50, 100);
        addObject(platform16,965,711);
        platform16.setLocation(919,718);
        platform16.setLocation(920,718);
        platform16.setLocation(920,722);
        Platform platform17 = new Platform(500, 50);
        addObject(platform17,1169,747);
        Platform platform18 = new Platform(50, 80);
        addObject(platform18,934,545);
        platform18.setLocation(940,540);
        Platform platform19 = new Platform(50, 80);
        addObject(platform19,1030,600);
        Platform platform20 = new Platform();
        addObject(platform20,191,757);
        platform20.setLocation(188,762);
        platform20.setLocation(187,762);
        Spike spike = new Spike();
        addObject(spike,467,844);
        Spike spike2 = new Spike();
        addObject(spike2,505,844);
        Spike spike3 = new Spike();
        addObject(spike3,543,844);
        Spike spike4 = new Spike();
        addObject(spike4,581,844);
        Spike spike5 = new Spike();
        addObject(spike5,178,731);
        RightSpike rightSpike = new RightSpike();
        addObject(rightSpike,435,749);
        LeftSpike leftSpike = new LeftSpike();
        addObject(leftSpike,73,748);
        Spike spike6 = new Spike();
        addObject(spike6,279,576);
        Spike spike7 = new Spike();
        addObject(spike7,241,576);
        RightSpike rightSpike2 = new RightSpike();
        addObject(rightSpike2,230,475);
        InvisiblePlatform invisiblePlatform = new InvisiblePlatform();
        addObject(invisiblePlatform,53,513);
        DownSpike downSpike = new DownSpike();
        addObject(downSpike,525,582);
        DownSpike downSpike2 = new DownSpike();
        addObject(downSpike2,570,582);
        Spike spike8 = new Spike();
        addObject(spike8,475,525);
        Spike spike9 = new Spike();
        addObject(spike9,436,525);
        Platform platform21 = new Platform(50, 50);
        addObject(platform21,530,431);
        platform21.setLocation(545,400);
        character.setLocation(375,493);
        LeftSpike leftSpike2 = new LeftSpike();
        addObject(leftSpike2,496,400);
        Spike spike10 = new Spike();
        addObject(spike10,619,844);
        Spike spike11 = new Spike();
        addObject(spike11,657,844);
        Spike spike12 = new Spike();
        addObject(spike12,695,844);
        Spike spike13 = new Spike();
        addObject(spike13,733,844);
        Spike spike14 = new Spike();
        addObject(spike14,771,844);
        Spike spike15 = new Spike();
        addObject(spike15,809,844);
        Spike spike16 = new Spike();
        addObject(spike16,847,844);
        Spike spike17 = new Spike();
        addObject(spike17,885,844);
        LeftSpike leftSpike3 = new LeftSpike();
        addObject(leftSpike3,684,566);
        LeftSpike leftSpike4 = new LeftSpike();
        addObject(leftSpike4,980,618);
        DownSpike downSpike3 = new DownSpike();
        addObject(downSpike3,706,460);
        DownSpike downSpike4 = new DownSpike();
        addObject(downSpike4,744,460);
        DownSpike downSpike5 = new DownSpike();
        addObject(downSpike5,782,460);
        DownSpike downSpike6 = new DownSpike();
        addObject(downSpike6,820,460);
        DownSpike downSpike7 = new DownSpike();
        addObject(downSpike7,858,460);
        Platform platform22 = new Platform(300, 500);
        addObject(platform22,1380,614);
        platform22.setLocation(1397,637);
        platform22.setLocation(1634,634);
        platform22.setLocation(1438,651);
        platform22.setLocation(1525,662);
        character.setLocation(6,838);
        Coin coin = new Coin();
        addObject(coin,545,650);
        Coin coin2 = new Coin();
        addObject(coin2,177,670);
        Coin coin3 = new Coin();
        addObject(coin3,181,420);
        Coin coin4 = new Coin();
        addObject(coin4,941,472);
        Coin coin5 = new Coin();
        addObject(coin5,1031,520);
        Coin coin6 = new Coin();
        addObject(coin6,543,480);
        Coin coin7 = new Coin();
        addObject(coin7,114,845);
        Coin coin8 = new Coin();
        addObject(coin8,23,630);
        Coin coin9 = new Coin();
        addObject(coin9,756,513);
        Coin coin10 = new Coin();
        addObject(coin10,720,357);
        InvisiblePlatform invisiblePlatform2 = new InvisiblePlatform();
        addObject(invisiblePlatform2,613,414);
    }
}
