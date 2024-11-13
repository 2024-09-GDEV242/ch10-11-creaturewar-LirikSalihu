
/**
 * Represents a Balrog, a special type of demon that attacks twice.
 *
 * @author Lirik Salihu
 * @version 2024.11.12
 */
public class Balrog extends Demon {

    /**
     * Constructs a Balrog with the specified strength and health.
     * @param strength the strength of the Balrog
     * @param health the health of the Balrog
     */
    public Balrog(int strength, int health) {
        super(strength, health);
    }

    /**
     * Performs two attacks in one turn.
     * @return the total damage dealt by the Balrog's double attack
     */
    @Override
    public int attack() {
        int firstAttack = super.attack();
        int secondAttack = super.attack();
        System.out.println("Balrog attacks twice!");
        return firstAttack + secondAttack;
    }
}
