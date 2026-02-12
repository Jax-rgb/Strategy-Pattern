import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    protected AttackStrategy attackStrategy;
    protected List<DefenseStrategy> defenseStrategies = new ArrayList<>();

    public void attack() {
        if (attackStrategy != null) {
            attackStrategy.attack();
        }
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}
