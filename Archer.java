public class Archer extends Character {
    public Archer() {
        attackStrategy = new ShootArrow();
        defenseStrategies.add(new Dodge());
    }
}
