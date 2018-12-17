package builder.fluent.cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat.Builder("kitty").age(15).build();
        System.out.println(cat);
    }
}
