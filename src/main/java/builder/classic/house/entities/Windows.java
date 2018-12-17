package builder.classic.house.entities;

public class Windows {
    private String material;
    private int number;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "material='" + material + '\'' +
                ", number=" + number +
                '}';
    }
}
