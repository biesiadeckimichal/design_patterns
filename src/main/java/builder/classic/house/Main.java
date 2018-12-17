package builder.classic.house;

import builder.classic.house.types.BlockHouseBuilder;
import builder.classic.house.types.StodolaHouseBuilder;
import builder.classic.house.types.WiezowiecHouseBuilder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder wiezowiecHouseBuilder = new WiezowiecHouseBuilder();
        HouseDirector wiezowiecDirector = new HouseDirector(wiezowiecHouseBuilder);
        wiezowiecDirector.buildHouse();
        House wiezowiec = wiezowiecDirector.getHouse();
        System.out.println(wiezowiec);

        HouseBuilder stodolaHouseBuilder = new StodolaHouseBuilder();
        HouseDirector stodolaDirector = new HouseDirector(stodolaHouseBuilder);
        stodolaDirector.buildHouse();
        House stodola = stodolaDirector.getHouse();
        System.out.println(stodola);

        HouseBuilder blockHouseBuilder = new BlockHouseBuilder();
        HouseDirector blockHDirector = new HouseDirector(blockHouseBuilder);
        blockHDirector.buildHouse();
        House block = blockHDirector.getHouse();
        System.out.println(block);
    }
}
