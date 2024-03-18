import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
    /**
     * Act - do whatever the crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        
    public Crab() {
         getImage().scale(100, 100);
    }
    
    public void act()
    {
        // Add your action code here.
        checkKeyboard();
    
    }
    public void checkKeyboard()
    {
        boolean key= Greenfoot.isKeyDown("right");
        if  (key==true)
        {
            turnTowards(getX()+2,getY());
            setLocation(getX()+2,getY());
        }
       key= Greenfoot.isKeyDown("left");
        if  (key==true)
        {
            turnTowards(getX()-2,getY());
            setLocation(getX()-2,getY());
        }
    key= Greenfoot.isKeyDown("up");
        if  (key==true)
        {
            turnTowards(getX(),getY()-2);
            setLocation(getX(),getY()-2);
        }
    key= Greenfoot.isKeyDown("down");
        if  (key==true)
        {
            turnTowards(getX(),getY()+2);
            setLocation(getX(),getY()+2);
        }

    
    
    }
}
