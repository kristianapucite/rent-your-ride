package model.userTemplatePattern;

public class BronzeUser extends User{

    Level level = Level.BRONZE;

    public BronzeUser(String name, String surname, String personCode, String password, String cardNr) {
        super(name, surname, personCode, password, cardNr);
    }

    @Override
    public double calculateUserRatio() {
        // System.out.println("your bronze user ratio is 1");
        return 1;
    }

    @Override
    public String getUserLevel() {
        return "BRONZE";
    }
}
