package model.zoneFactoryPattern;

public abstract class Zone {
    private String name;
    private double zoneRatio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZoneRatio() {
        return zoneRatio;
    }

    public void setZoneRatio(double zoneRatio) {
        this.zoneRatio = zoneRatio;
    }
}
