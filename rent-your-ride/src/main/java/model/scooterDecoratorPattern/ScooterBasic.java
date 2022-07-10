package model.scooterDecoratorPattern;

public class ScooterBasic implements Scooter{
    @Override
    public String getDescription() {
        return "Price = Basic fee ";
    }

    @Override
    public double getPricePerKm() {
        return 0.5;
    }
}
