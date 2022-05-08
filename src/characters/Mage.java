package characters;

import attack.MagicAttack;
import defend.MagicDefence;

public class Mage extends Character {
    public Mage(String type, String name, String weapon){
        super(type, name, weapon);
        attackStrategy = new MagicAttack();
        defenceStrategy = new MagicDefence();
    }
}
