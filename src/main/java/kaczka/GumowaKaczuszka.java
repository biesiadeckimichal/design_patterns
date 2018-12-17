package kaczka;

import kaczka.logic.*;

public class GumowaKaczuszka implements Kaczka{
    // @Override nie jest konieczne ale to po prostu dobra praktyka
    private final Latajacy latanie;
    private final Kwakanie kwaczenie;
    private final Plywajacy plywanie;


    public GumowaKaczuszka() {
        latanie = new NieLatam();
        kwaczenie = new Piszczacy();
        plywanie = new Dryfuje();
    }


    @Override
    public void lataj() {
        latanie.lataj();
    }

    @Override
    public void kwacz() {
        kwaczenie.kwacz();
    }

    @Override
    public void plywaj() {
        plywanie.plyn();
    }
}
