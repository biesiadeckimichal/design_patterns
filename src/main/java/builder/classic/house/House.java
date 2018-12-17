package builder.classic.house;


import builder.classic.house.entities.Roof;
import builder.classic.house.entities.Windows;

public class House {
    private Windows windows;
    private Roof roof;

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", roof=" + roof +
                '}';
    }
}
