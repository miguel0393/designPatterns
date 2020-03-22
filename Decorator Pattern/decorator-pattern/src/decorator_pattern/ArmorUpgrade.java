package decorator_pattern;

public class ArmorUpgrade extends UnitDecorator {

    public ArmorUpgrade(Unit unit) {
        super(unit);
    }

    @Override
    public double getArmor() {
        return super.getArmor() + 1;
    }
}
