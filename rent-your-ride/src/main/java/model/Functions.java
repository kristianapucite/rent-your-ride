package model;

import model.rideStrategyPattern.Parking;
import model.rideStrategyPattern.Ride;
import model.rideStrategyPattern.RideFail;
import model.rideStrategyPattern.RideSuccess;
import model.scooterDecoratorPattern.Scooter;
import model.scooterDecoratorPattern.ScooterAdvanced;
import model.scooterDecoratorPattern.ScooterBasic;
import model.scooterDecoratorPattern.ScooterSuper;
import model.userTemplatePattern.BronzeUser;
import model.userTemplatePattern.GoldUser;
import model.userTemplatePattern.SilverUser;
import model.zoneFactoryPattern.ZoneFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Functions {

    String userLevel;
    double userRatio;
    String userName;
    Scooter scooter;
    Ride ride;

    void registerUser() {
        System.out.println("Enter your user level code");
        int userLevelCode = (int) ((Math.random() * (3 - 1)) + 1);

        System.out.println("You entered code: " + userLevelCode);

        if(userLevelCode == 1) {
            GoldUser goldUser = new GoldUser("John", "Doe", "090590-11590", "password", "1234-5678-9101-1213");
            this.userLevel = goldUser.getUserLevel();
            this.userRatio = goldUser.calculateUserRatio();
            userName = goldUser.name;
        } else if(userLevelCode == 2) {
            SilverUser silverUser = new SilverUser("John", "Doe", "090590-11590", "password", "1234-5678-9101-1213");
            this.userLevel = silverUser.getUserLevel();
            this.userRatio = silverUser.calculateUserRatio();
            userName = silverUser.name;
        } else {
            BronzeUser bronzeUser = new BronzeUser("John", "Doe", "090590-11590", "password", "1234-5678-9101-1213");
            this.userLevel = bronzeUser.getUserLevel();
            this.userRatio = bronzeUser.calculateUserRatio();
            userName = bronzeUser.name;
        }
        System.out.println("Congratulations, " + userName + ", you have been registered! Your user level is - " + userLevel + "!  (ratio = " + userRatio + ")");
    }

    public double getUserRatio() {
        return userRatio;
    }

    public double getPricePerKm() {
        System.out.println("Choose scooter type: BASIC | ADVANCED | SUPER");
        int scooterType = (int) ((Math.random() * (3 - 1)) + 1);

        if(scooterType == 1) {
            System.out.println("You have chosen BASIC scooter type");
            scooter = new ScooterBasic();
        } else if (scooterType == 2) {
            System.out.println("You have chosen ADVANCED scooter type");
            scooter = new ScooterAdvanced(new ScooterBasic());
        } else if(scooterType == 3) {
            System.out.println("You have chosen SUPER scooter type");
            scooter = new ScooterSuper(new ScooterAdvanced(new ScooterBasic()));
        }

        assert scooter != null;
        var description = scooter.getDescription();
        var pricePerKm = scooter.getPricePerKm();
        System.out.println(description + "= " + pricePerKm + " eur/km");
        return pricePerKm;
    }

    public double getZoneRatio() {
        int zoneType = (int) ((Math.random() * (3 - 1)) + 1);
        ZoneFactory zoneFactory = new ZoneFactory();
        var zone = zoneFactory.getZone(zoneType);
        return zone.getZoneRatio();
    }

    public int getRandomIsParkingValid() {
        return (int) ((Math.random() * (2 - 1)) + 1);
    }

    public Ride createRide(int randomParkingValidation) {
        if(randomParkingValidation == 1) {
            ride = new RideSuccess();
        } else {
            ride = new RideFail();
        }
        return ride;
    }

    public int getRandomKm() {
        var km =  (int) ((Math.random() * (50 - 1)) + 1);
        System.out.println("You have driven " + km + " km");
        return km;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String calculatePrice(double userRatio, double pricePerKm, double zoneRatio, Ride ride, int km) {

        Parking parking = ride.parking;
        boolean isParkingValid = parking.isParkingValid();

        if (isParkingValid) {
            var price = km * pricePerKm * userRatio * zoneRatio;
            var priceRounded = round(price, 2);
            return "Thank you for your ride! Total price is: " + priceRounded + " EUR";
        } else {
            return "Ride is not finished, please park your scooter correctly!";
        }
    }

}
