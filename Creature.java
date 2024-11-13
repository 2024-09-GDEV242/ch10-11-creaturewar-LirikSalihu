
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Lirik Salihu
 * @version 2024.11.12
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature(int str, int hp) {
        this.str = str;
        this.hp = hp;
        this.max_hp = hp;
    }
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle.
     * @return a value between 1 and str to be used to cause damage to another creature.
     */
    public int attack() {
        // Generate random damage between 1 and strength
        return 1 + (int)(Math.random() * str);
    }
    
    /**
     * Determines if this creature is still capable of fighting.
     * @return true if current hit point level is greater than zero, indicating the creature is alive.
     */
    public boolean isAlive() {
        return hp > 0;
    }
    
    /**
     * Determines if this creature has been knocked out of battle.
     * @return true if current hit point level is less than or equal to zero.
     */
    public boolean isKnockedOut() {
        return hp <= 0;
    }
    
    /**
     * Takes a specified amount of damage, reducing the current hit points.
     * @param damage value to remove from hit point count.
     */
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0; 
        }
    }
    
    /**
     * Gets the current health of the creature, primarily for status reporting.
     * @return the current hit points of the creature.
     */
    public int getHealth() {
        return hp;
    }
}
