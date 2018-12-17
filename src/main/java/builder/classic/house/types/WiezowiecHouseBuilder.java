package builder.classic.house.types;

import builder.classic.house.House;
import builder.classic.house.HouseBuilder;
import builder.classic.house.entities.Roof;
import builder.classic.house.entities.Windows;

public class WiezowiecHouseBuilder implements HouseBuilder {

    private House house;

    public WiezowiecHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWindows() {
        Windows windows = new Windows();
        windows.setMaterial("plastik");
        windows.setNumber(1000);
        house.setWindows(windows);
    }

    @Override
    public void buildRoof() {
        Roof roof = new Roof();
        roof.setMaterial("blacha");
        roof.setType("płaski");
        house.setRoof(roof);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
