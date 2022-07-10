package model.rideStrategyPattern;

public class ParkingInvalid implements Parking{
    @Override
    public boolean isParkingValid() {
        return false;
    }
}
