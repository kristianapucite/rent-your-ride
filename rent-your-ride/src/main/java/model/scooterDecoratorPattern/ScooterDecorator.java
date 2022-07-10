package model.scooterDecoratorPattern;

abstract class ScooterDecorator implements Scooter {

    protected Scooter tempScooter;

    public ScooterDecorator(Scooter newScooter) {
        tempScooter = newScooter;
    }

    public String getDescription() {
        return tempScooter.getDescription();
    }

    public double getPricePerKm() {
        return tempScooter.getPricePerKm();
    }

}
