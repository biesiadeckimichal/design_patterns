package builder.classic.spell.type;

import builder.classic.spell.Spell;
import builder.classic.spell.SpellBuilder;
import builder.classic.spell.entieties.AdditionalEffect;
import builder.classic.spell.entieties.Element;
import builder.classic.spell.entieties.Power;
import builder.classic.spell.entieties.Range;

public class Fireball implements SpellBuilder{

    private Spell spell;

    public Fireball() {
        this.spell = new Spell();
    }

    @Override
    public void buildAdditionalEffect() {
        AdditionalEffect additionalEffect = new AdditionalEffect();
        additionalEffect.setAdditionalEffect("burning");
        spell.setAdditionalEffect(additionalEffect);
    }

    @Override
    public void buildElement() {
        Element element = new Element();
        element.setElement("Fire");
        spell.setElement(element);
    }

    @Override
    public void buildPower() {
        Power power = new Power();
        power.setPower(100);
        spell.setPower(power);
    }

    @Override
    public void buildRange() {
        Range range = new Range();
        range.setRange(50);
        spell.setRange(range);
    }

    @Override
    public Spell getSpell() {
        return spell;
    }

}
