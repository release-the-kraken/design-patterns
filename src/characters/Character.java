package characters;

import attack.AttackStrategy;
import defend.DefenceStrategy;

public abstract class Character {
    String type;
    String name;
    String weapon;
    AttackStrategy attackStrategy;
    DefenceStrategy defenceStrategy;

    public String getName() {
        return name;
    }

    public Character(String type, String name, String weapon) {
        this.type = type;
        this.name = name;
        this.weapon = weapon;
    }

    public void setDefenceStrategy(DefenceStrategy defenceStrategy) {
        this.defenceStrategy = defenceStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }
    public void attack(){
        attackStrategy.attack();
    }
    public void defend(){
        defenceStrategy.defend();
    }
    public void battleCry(){
        System.out.printf("I am %s! A mighty %s! You have my %s!\n", this.name, this.type, this.weapon);
    };
}
