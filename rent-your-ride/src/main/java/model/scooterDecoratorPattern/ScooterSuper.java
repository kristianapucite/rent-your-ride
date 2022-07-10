package model.scooterDecoratorPattern;

public class ScooterSuper extends ScooterDecorator{
    public ScooterSuper(Scooter newScooter) {
        super(newScooter);
    }

    public String getDescription() {
        return tempScooter.getDescription() + "+ super features fee ";
    }

    public double getPricePerKm() {
        return tempScooter.getPricePerKm() + 0.2;
    }
}
