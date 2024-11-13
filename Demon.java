
/**
 * Represents a demon creature with strength and health.
 * Demons have a chance to inflict additional magical damage on attack.
 *
 * @author Lirik Salihu
 * @version 2024.11.12
 */
public class Demon extends Creature {

    /**
     * Constructs a Demon with the specified strength and health.
     * @param strength the strength of the demon
     * @param health the health of the demon
     */
    public Demon(int strength, int health) {
        super(strength, health);
    }

    /**
     * Performs an attack with a chance to inflict additional magical damage.
     * @return the damage dealt by the demon's attack
     */
    @Override
    public int attack() {
        int baseDamage = super.attack();
        // 5% chance for additional 50 magical damage
        if (Math.random() < 0.05) {
            System.out.println("Demon inflicts magical damage!");
            return baseDamage + 50;
        }
        return baseDamage;
    }
}
