package builder.classic.spell;

import builder.classic.spell.type.Fireball;

public class Main {
    public static void main(String[] args) {
        SpellBuilder fireballSpellBuilder = new Fireball();
        SpellEnginer fireballSpellEnginer = new SpellEnginer(fireballSpellBuilder);
        fireballSpellEnginer.buildSpell();
        Spell fireball = fireballSpellBuilder.getSpell();
        System.out.println(fireball);

    }

}
