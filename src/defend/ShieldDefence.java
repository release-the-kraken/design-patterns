package defend;

public class ShieldDefence implements DefenceStrategy{
    @Override
    public void defend() {
        System.out.println("Use shield!");
    }
}
