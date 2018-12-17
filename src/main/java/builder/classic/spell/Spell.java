package builder.classic.spell;

import builder.classic.spell.entieties.AdditionalEffect;
import builder.classic.spell.entieties.Element;
import builder.classic.spell.entieties.Power;
import builder.classic.spell.entieties.Range;

public class Spell {
    private AdditionalEffect additionalEffect;
    private Element element;
    private Power power;
    private Range range;

    public void setAdditionalEffect(AdditionalEffect additionalEffect) {
        this.additionalEffect = additionalEffect;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "additionalEffect=" + additionalEffect +
                ", element=" + element +
                ", power=" + power +
                ", range=" + range +
                '}';
    }
}
