package builder.fluent.car;

public class Car {
    private String color;
    private int age;

    private Car(Builder builder) {
        this.color = builder.color;
        this.age = builder.age;
    }

    public static class Builder {
        private String color;
        private int age;

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
