package model.zoneFactoryPattern;

public class Zone1 extends Zone{
    public Zone1() {
        setName("zone1");
        setZoneRatio(1);
        System.out.println("Your ride was in " + getName());
    }
}
