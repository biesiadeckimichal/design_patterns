package builder.classic.house.types;

import builder.classic.house.House;
import builder.classic.house.HouseBuilder;
import builder.classic.house.entities.Roof;
import builder.classic.house.entities.Windows;

public class StodolaHouseBuilder implements HouseBuilder {

    private House house;

    public StodolaHouseBuilder() {
        this.house = new House();
    }


    @Override
    public void buildWindows() {
        Windows windows = new Windows();
        windows.setMaterial("wooden");
        windows.setNumber(4);
        house.setWindows(windows);
    }

    @Override
    public void buildRoof() {
        Roof roof = new Roof();
        roof.setMaterial("wooden");
        roof.setType("pointy");
        house.setRoof(roof);

    }

    @Override
    public House getHouse() {
        return house;
    }
}
