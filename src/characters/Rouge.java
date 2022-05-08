package characters;

import attack.BowAttack;
import defend.EvasiveDefence;

public class Rouge extends Character {
    public Rouge(String type, String name, String weapon) {
        super(type, name, weapon);
        attackStrategy = new BowAttack();
        defenceStrategy = new EvasiveDefence();
    }
}
