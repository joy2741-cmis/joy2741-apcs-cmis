import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Character 
{
    int lvl;
    int exp;
    Character target;

    public Hero( Character target )
    {
        super(50, 50, 5, 20);
        lvl = 1;
        exp = 0;
        this.target = target;
    }//end constructor

    public void act() 
    {
        controls();
    }//end act 
    
    public void controls()
    {
        if( Greenfoot.isKeyDown("w") )
        {
             setLocation(getX(),getY()-1);
        } 
        else if( Greenfoot.isKeyDown("a") )
        {
            setLocation(getX()-1,getY());
        }
        else if( Greenfoot.isKeyDown("d") )
        {
            setLocation(getX()+1,getY());
        }
        else if( Greenfoot.isKeyDown("s") )
        {
            setLocation(getX(),getY()+1);
        }//end if     
    }//end controls

    //ADDITIONAL METHODS
    public int attack()
    {
        int randomAD = getMinAD() + Greenfoot.getRandomNumber(getMaxAD() - getMinAD());
        return randomAD;
    }//end attack

    public boolean isFighting()
    {
        while( isTouching( Slime.class ) )
        {
            if( Greenfoot.isKeyDown("Space"))
            {
                System.out.println("is fighting!");
                return true;                
            }
        }//end while
        return false;
    }//end is Fighting

    public void resetEXP( int newEXP )
    {
        exp = 0;
    }

    public int getLvl()
    {
        return lvl;
    }//end getLvl

    public void levelUp()
    {
        int requirement = 100 * lvl;
        if( exp == requirement )
        {
            lvl++;
            setMaxAD(getMaxAD() + Greenfoot.getRandomNumber(30)); //increase AD
            setHealth(getHealth() + Greenfoot.getRandomNumber(50)); //increase Health
            setMana(getMana() + Greenfoot.getRandomNumber(50)); //increase Mana
            resetEXP(0);
        }
    }

    //METHODS INHERITED FROM CHARACTER
    public int skill()
    {
        return 0;
    }//end skill

    public int lowerHealth()
    {
        int health = getHealth();
        int damage = target.attack();
        System.out.println("target.attack(): " + damage);
        int newHealth = health - damage;
        setHealth(newHealth);
        return health;
    }//end lowerHealth       

    public int randomEXP()
    {
        int randomEXP = Greenfoot.getRandomNumber(30) * lvl;
        return randomEXP;
    }//end randomEXP

    public int lowerMana()
    {
        int mana = getMana();
        return mana;
    }//end lowerMana

    public int regeneratesHealth()    
    {
        return 0;
    }//end lowerMana

    public int regeneratesMana()
    {
        return 0;
    }//end lowerMana

}
