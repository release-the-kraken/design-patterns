package defend;

public class EvasiveDefence implements DefenceStrategy{
    @Override
    public void defend() {
        System.out.println("Evade attack!");
    }
}
