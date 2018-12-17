package builder.classic.house;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
