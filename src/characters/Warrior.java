package characters;

import attack.SwordAttack;
import defend.ShieldDefence;

public class Warrior extends Character{
    public Warrior(String type, String name, String weapon){
        super(type, name, weapon);
        attackStrategy = new SwordAttack();
        defenceStrategy = new ShieldDefence();
    }

}
