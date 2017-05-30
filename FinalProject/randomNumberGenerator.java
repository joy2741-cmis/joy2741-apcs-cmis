import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class randomNumberGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class randomNumberGenerator extends Actor
{
    HeroStats heroStats = new HeroStats();
    BossStats bossStats = new BossStats();
  
    public void act() 
    {
        // Add your action code here.
    }    

    public int heroDamage()
    {
        return heroStats.getMinAD() + Greenfoot.getRandomNumber(heroStats.getMaxAD() - heroStats.getMinAD());
    }
    
    public int heroSkill()
    {
        return 10 + heroStats.getMinAD() + Greenfoot.getRandomNumber(heroStats.getMaxAD() - heroStats.getMinAD());
    }

    public int bossDamage()
    {
        return bossStats.getMinAD() + Greenfoot.getRandomNumber(bossStats.getMaxAD() - bossStats.getMinAD());
    }
    
    public int EXPgained()
    {
        int exp = heroStats.getEXP();
        int lvl = heroStats.getLvl();
        return Greenfoot.getRandomNumber(30) * lvl;
    }
}
