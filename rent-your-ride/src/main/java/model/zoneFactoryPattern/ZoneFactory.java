package model.zoneFactoryPattern;

public class ZoneFactory {

    public Zone getZone(int zone) {
        Zone newZone = null;

        if(zone == 1) {
            return new Zone1();
        } else if (zone == 2) {
            return new Zone2();
        } else if (zone == 3) {
            return new Zone3();
        } else return null;
    }
}
