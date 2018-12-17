package builder.classic.house.types;

import builder.classic.house.House;
import builder.classic.house.HouseBuilder;
import builder.classic.house.entities.Roof;
import builder.classic.house.entities.Windows;

public class BlockHouseBuilder implements HouseBuilder {

    private House house;

    public BlockHouseBuilder() {
        this.house = new House();
    }


    @Override
    public void buildWindows() {
        Windows windows = new Windows();
        windows.setMaterial("plastic");
        windows.setNumber(500);
        house.setWindows(windows);
    }

    @Override
    public void buildRoof() {
        Roof roof = new Roof();
        roof.setType("flat");
        roof.setMaterial("conrete");
        house.setRoof(roof);
    }

    @Override
    public House getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "BlockHouseBuilder{" +
                "house=" + house +
                '}';
    }
}
