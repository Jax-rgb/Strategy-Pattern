public class Knight extends Character {
    public Knight() {
        attackStrategy = new SwingSword();
        defenseStrategies.add(new Shield());
        defenseStrategies.add(new Dodge());
        defenseStrategies.add(new MagicBarrier());
    }
}
