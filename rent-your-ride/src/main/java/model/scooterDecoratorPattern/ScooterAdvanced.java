package model.scooterDecoratorPattern;

public class ScooterAdvanced extends ScooterDecorator{
    public ScooterAdvanced(Scooter newScooter) {
        super(newScooter);
    }

    public String getDescription() {
        return tempScooter.getDescription() + "+ advanced features fee ";
    }

    public double getPricePerKm() {
        return tempScooter.getPricePerKm() + 0.3;
    }
}
