package model.userTemplatePattern;

public class SilverUser extends User{

    Level level = Level.SILVER;

    public SilverUser(String name, String surname, String personCode, String password, String cardNr) {
        super(name, surname, personCode, password, cardNr);
    }

    @Override
    public double calculateUserRatio() {
        // System.out.println("your silver user ratio is 0.8");
        return 0.8;
    }

    @Override
    public String getUserLevel() {
        return "SILVER";
    }
}
