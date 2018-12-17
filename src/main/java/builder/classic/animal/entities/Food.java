package builder.classic.animal.entities;

public class Food {
    private String type;
    private double kiloPerDay;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKiloPerDay() {
        return kiloPerDay;
    }

    public void setKiloPerDay(double kiloPerDay) {
        this.kiloPerDay = kiloPerDay;
    }

    @Override
    public String toString() {
        return "Food{" +
                "type='" + type + '\'' +
                ", kiloPerDay=" + kiloPerDay +
                '}';
    }
}
