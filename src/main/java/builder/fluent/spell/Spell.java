package builder.fluent.spell;

public class Spell {
    private String range;
    private int power;
    private String element;
    private String additionalEffect;

    private Spell (Builder builder) {
        this.range = builder.range;
        this.power = builder.power;
        this.element = builder.element;
        this.additionalEffect = builder.additionalEffect;

    }

    public static class Builder {
        private String range;
        private int power;
        private String element;
        private String additionalEffect;

        public Builder range(String range) {
            this.range = range;
            return this;
        }

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder element(String element) {
            this.element = element;
            return this;
        }

        public Builder additionalEfect(String additionalEffect) {
            this.additionalEffect = additionalEffect;
            return this;
        }

        public Spell build() {
            return new Spell(this);
        }
    }

    @Override
    public String toString() {
        return "Spell{" +
                "range='" + range + '\'' +
                ", power=" + power +
                ", element='" + element + '\'' +
                ", additionalEfect='" + additionalEffect + '\'' +
                '}';
    }
}
