public class Wizard extends Character {
    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategies.add(new MagicBarrier());
    }
}
