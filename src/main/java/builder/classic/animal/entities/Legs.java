package builder.classic.animal.entities;

public class Legs {
    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Legs{" +
                "number=" + number +
                '}';
    }
}
