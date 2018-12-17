package builder.fluent.house;

public class House {
    private String color;
    private String materialType;
    private int numberOfWindows;
    private final String roofType;

    private House (final Builder builder) {
        this.color = builder.color;
        this.materialType = builder.materialType;
        this.numberOfWindows = builder.numberOfWindows;
        this.roofType = builder.roofType;
    }

    public static class Builder {
        private String color;
        private String materialType;
        private int numberOfWindows;
        private String roofType;

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder materialType(String materialType) {
            this.materialType = materialType;
            return this;
        }

        public Builder numberOfWindows (int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public Builder roofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

    @Override
    public String toString() {
        return "Builder{" +
                "color='" + color + '\'' +
                ", materialType='" + materialType + '\'' +
                ", numberOfWindows=" + numberOfWindows +
                ", roofType='" + roofType + '\'' +
                '}';
    }
}
