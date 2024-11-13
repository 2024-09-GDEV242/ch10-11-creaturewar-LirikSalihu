
/**
 * Represents an elf creature with strength and health.
 * Elves have a chance to deal double magical damage on attack.
 *
 * @author Lirik Salihu
 * @version 2024.11.12
 */
public class Elf extends Creature {

    /**
     * Constructs an Elf with the specified strength and health.
     * @param strength the strength of the elf
     * @param health the health of the elf
     */
    public Elf(int strength, int health) {
        super(strength, health);
    }

    /**
     * Performs an attack with a chance to deal double damage due to magic.
     * @return the damage dealt by the elf's attack
     */
    @Override
    public int attack() {
        int baseDamage = super.attack();
        if (Math.random() < 0.1) {
            System.out.println("Elf casts a magical attack!");
            return baseDamage * 2;
        }
        return baseDamage;
    }
}
