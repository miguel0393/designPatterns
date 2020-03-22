package decorator_pattern;

public class WeaponUpgrade extends UnitDecorator {

    public WeaponUpgrade(Unit unit) {
        super(unit);
    }

    @Override
    public double getDamage() {
        return super.getDamage() + 1;
    }
}
