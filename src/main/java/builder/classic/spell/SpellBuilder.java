package builder.classic.spell;

public interface SpellBuilder {
    void buildAdditionalEffect();
    void buildElement();
    void buildPower();
    void buildRange();
    Spell getSpell();
}
