package builder.fluent.spell;

public class Main {
    public static void main(String[] args) {
        Spell fireball = new Spell.Builder()
                .element("fire")
                .power(100)
                .range("single")
                .additionalEfect("burning")
                .build();
        System.out.println(fireball);
    }
}
