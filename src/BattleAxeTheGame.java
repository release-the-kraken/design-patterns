import attack.SwordAttack;
import characters.Character;
import characters.Mage;
import characters.Rouge;
import characters.Warrior;

public class BattleAxeTheGame {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Character warrior = new Warrior("Warrior", "Conan the Librarian", "sword");
        Character mage = new Mage("Mage", "Cumberbatch the Powerful", "wand");
        Character rouge = new Rouge("Rouge", "Slickfist the Dexterous", "bow");
        warrior.battleCry();
        warrior.attack();
        warrior.defend();
        rouge.battleCry();
        rouge.attack();
        rouge.defend();
        mage.battleCry();
        mage.attack();
        mage.defend();
        //dynamically setting attack strategy
        System.out.println(rouge.getName() + " has found a sword!");
        rouge.setAttackStrategy(new SwordAttack());
        rouge.attack();

    }

}
