package attack;

public class BowAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Shoot bow!");
    }
}
