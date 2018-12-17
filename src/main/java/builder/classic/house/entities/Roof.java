package builder.classic.house.entities;

public class Roof {

    private String material;
    private String type;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
