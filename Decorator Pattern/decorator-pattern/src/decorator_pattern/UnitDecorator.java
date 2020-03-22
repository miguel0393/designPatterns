package decorator_pattern;

public class UnitDecorator implements Unit {

    private Unit unit;

    public UnitDecorator(Unit unit) {
        this.unit = unit;
    }

    @Override
    public double getDamage() {
        return unit.getDamage();
    }

    @Override
    public double getArmor() {
        return unit.getArmor();
    }

}
