package builder.fluent.ship;

public class Ship {
    private int length;
    private String name;
    private int numberOfMasts;
    private String type;

    private Ship(final Builder builder) {
        this.length = builder.length;
        this.name = builder.name;
        this.numberOfMasts = builder.numberOfMasts;
        this.type = builder.type;
    }

    public static class Builder {
        private int length;
        private String name;
        private int numberOfMasts;
        private String type;

        public Builder length(int length) {
            this.length = length;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder numberOfMasts(int numberOfMasts) {
            this.numberOfMasts = numberOfMasts;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Ship build() {
            return new Ship(this);
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", numberOfMasts=" + numberOfMasts +
                ", type='" + type + '\'' +
                '}';
    }
}
