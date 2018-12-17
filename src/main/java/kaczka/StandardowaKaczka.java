package kaczka;

import kaczka.Kaczka;
import kaczka.logic.Kwakanie;
import kaczka.logic.Latajacy;

// w celu zmniejszenia duplikacji tworzymy klase abstrakcyjna
// nie ma tu plywania bo pozniej to doda na gitcie
// to sa duplikaty
// private final Latajacy latanie;
// private final Kwakanie kwaczenie;
public abstract class StandardowaKaczka implements Kaczka {
    private final Latajacy latanie;
    private final Kwakanie kwaczenie;

    protected StandardowaKaczka(Latajacy latanie, Kwakanie kwaczenie) {
        this.latanie = latanie;
        this.kwaczenie = kwaczenie;
    }

    // ctr + o, od override, wybieramy metody ktore chcemy ovveridowac
    // nastepnie wybieramy z ktorej klasy lub implementacji


    @Override
    public void kwacz() {
        latanie.lataj();
    }

    @Override
    public void lataj() {
        kwaczenie.kwacz();
    }
}
