package model.rideStrategyPattern;

public class RideFail extends Ride{

    public RideFail() {
        super();
        parking = new ParkingInvalid();
    }
}
