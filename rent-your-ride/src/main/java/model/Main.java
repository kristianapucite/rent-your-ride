package model;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        System.out.println("===================================");
        Functions functions = new Functions();
        functions.registerUser();

        var userRatio = functions.getUserRatio();

        System.out.println("===================================");
        var pricePerKm = functions.getPricePerKm();

        System.out.println("===================================");
        var zoneRatio = functions.getZoneRatio();

        var km = functions.getRandomKm();
        int isParkingValid = functions.getRandomIsParkingValid();

        var ride = functions.createRide(isParkingValid);

        String finalMessage = functions.calculatePrice(userRatio, pricePerKm, zoneRatio, ride, km);

        System.out.println(finalMessage);
        System.out.println("===================================");
    }
}
