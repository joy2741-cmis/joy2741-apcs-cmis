import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    HeroStats stats = new HeroStats();
    int health = stats.getHealth();
    int mana = stats.getMana();
    int minAD = stats.getMinAD();
    int maxAD = stats.getMaxAD();
    int EXP = stats.getEXP();
    randomNumberGenerator generator = new randomNumberGenerator();
    BossStats boss = new BossStats();

    int lvl;
    Enemy target;

    public Hero( Enemy target )
    {
        GreenfootImage hero = getImage();
        hero.scale( hero.getWidth()/6, hero.getHeight()/6 );
        lvl = 1;
        this.target = (Enemy) target;
    }//end constructor

    public void act() 
    {
        controls();   
        setTarget();
        attack();
        isDead();
        setTargetSlime();
        attackSlime();
    }//end act 
    
    public int getHealth()
    {
        return health;
    }

    //METHODS
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
    public void attack()
    {
        if( target != null && isTouching(Boss.class) && Greenfoot.isKeyDown("x") )
        {
            int AD = generator.heroDamage();
            System.out.println("AD: " + AD);
            System.out.println("Boss Health: " + boss.getHealth());
            boss.setHealth(boss.getHealth() - AD);
            System.out.println("Boss Health After: " + boss.getHealth());
            turn(180);
            move(7);
            turn(-180);
        }
        else if ( target != null && isTouching(Boss.class) && Greenfoot.isKeyDown("y") )
        {
            int AD = generator.heroSkill();
            System.out.println("AD Skill: " + AD);
            System.out.println("Boss Health: " + boss.getHealth());
            boss.setHealth(boss.getHealth() - AD);
            System.out.println("Boss Health After Skill: " + boss.getHealth());
            turn(180);
            move(7);
            turn(-180);
            stats.setMana(stats.getMana()-5);
        }
    }//end attack
    
     public void attackSlime()
    {
        if( target != null && isTouching(Slime.class) && Greenfoot.isKeyDown("x") )
        {
            int AD = generator.heroDamage();
            System.out.println("AD: " + AD);
            System.out.println("Slime's Health: " + target.getHealth());
            target.setHealth(target.getHealth() - AD);
            System.out.println("Slime's Health Afterward: " + target.getHealth());
            turn(180);
            move(7);
            turn(-180);
        }
        else if ( target != null && isTouching(Slime.class) && Greenfoot.isKeyDown("y") )
        {
            int AD = generator.heroSkill();
            System.out.println("AD Skill: " + AD);
            System.out.println("Slime's Health: " + target.getHealth());
            target.setHealth(target.getHealth() - AD);
            System.out.println("Slime's Health after using skill: " + target.getHealth());
            turn(180);
            move(7);
            turn(-180);
            stats.setMana(stats.getMana()-5);
        }
    }//end attack
    
    public void setTarget()
    {
        Enemy boss = (Boss)getOneIntersectingObject(Boss.class);
        if( boss != null )
        {
            target = (Boss) boss;
        }
    }//end is Fighting
    
    public void setTargetSlime()
    {
        Slime slime = (Slime)getOneIntersectingObject(Slime.class);
        if( slime != null )
        {
            target = (Slime) slime;
        }
    }//end is Fighting


    public void resetEXP( int newEXP )
    {
        EXP = 0;
    }

    public int getLvl()
    {
        return lvl;
    }//end getLvl

    public void levelUp()
    {
        int requirement = 100 * lvl;
        if(EXP == requirement )
        {
            lvl++;
            stats.setMaxAD(stats.getMaxAD() + Greenfoot.getRandomNumber(30)); //increase AD
            stats.setHealth(stats.getHealth() + Greenfoot.getRandomNumber(50)); //increase Health
            stats.setMana(stats.getMana() + Greenfoot.getRandomNumber(50)); //increase Mana
            stats.setEXP(0);
        }
    }

    public boolean isDead()
    {
        if( stats.getHealth() == 0 )
        {
            System.out.println("Game Over");
            Greenfoot.stop();
            return true;
        }

        return false;
    }//end isDead()

}
