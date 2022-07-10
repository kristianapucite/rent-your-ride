package model.userTemplatePattern;

public class GoldUser extends User{

    Level level = Level.GOLD;

    public GoldUser(String name, String surname, String personCode, String password, String cardNr) {
        super(name, surname, personCode, password, cardNr);
    }

    @Override
    public double calculateUserRatio() {
        // System.out.println("your golden user ratio is 0.6");
        return 0.6;
    }
    @Override
    public String getUserLevel() {
        return "GOLD";
    }
}
