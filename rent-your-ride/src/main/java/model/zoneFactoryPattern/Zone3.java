package model.zoneFactoryPattern;

public class Zone3 extends Zone{
    public Zone3() {
        setName("zone3");
        setZoneRatio(1.4);
        System.out.println("Your ride was in " + getName());
    }
}
