package model.userTemplatePattern;

public abstract class User {
    public String name;
    public String surname;
    public String personCode;
    public String password;
    public String cardNr;
    String userLevel;
    double userRatio;

    public User(String name, String surname, String personCode, String password, String cardNr) {
        this.name = name;
        this.surname = surname;
        this.personCode = personCode;
        this.password = password;
        this.cardNr = cardNr;
    }

    abstract double calculateUserRatio();
    abstract String getUserLevel();
}
