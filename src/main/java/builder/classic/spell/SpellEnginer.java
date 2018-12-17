package builder.classic.spell;

public class SpellEnginer {
    private SpellBuilder spellBuilder;

    public SpellEnginer(SpellBuilder spellBuilder) {
        this.spellBuilder = spellBuilder;
    }

    public void buildSpell() {
        spellBuilder.buildPower();
        spellBuilder.buildElement();
        spellBuilder.buildAdditionalEffect();
        spellBuilder.buildRange();
    }
}
