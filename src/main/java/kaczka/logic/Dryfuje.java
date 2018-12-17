package kaczka.logic;

// Configuration ogolnie polega na wydzieleniu logiki latania, kwakania i plywania
public class Dryfuje implements Plywajacy {
    @Override
    public void plyn() {
        System.out.println("dryfuje");
    }
}
