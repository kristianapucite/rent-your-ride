package model.zoneFactoryPattern;

public class Zone2 extends Zone{
    public Zone2() {
        setName("zone2");
        setZoneRatio(1.2);
        System.out.println("Your ride was in " + getName());
    }
}
