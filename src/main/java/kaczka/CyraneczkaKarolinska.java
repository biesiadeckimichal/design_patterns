package kaczka;

import kaczka.logic.*;

public class CyraneczkaKarolinska implements Kaczka{
    // @Override nie jest konieczne ale to po prostu dobra praktyka
    // staramy sie usunac duplikacje logiki czyli w naszym przypadku
    // jest to implementacja metod lataj i kwacz w dwoch klasach
    // ktore dzialaja tak samo
    // poza tym nowe podejscie pozwala latwo podmienic bledne metody
    // poprzez stworzenie nowych instancji

    // przez final zabezpieczamy dane pole przed zmianami
    private final Latajacy latanie;
    private final Kwakanie kwaczenie;
    private final Plywajacy plywanie;

    // to jest miejsce gdzie wyciagamy logikie kwakania, latania, plywania
    public CyraneczkaKarolinska() {
        latanie = new LatanieNaSkrzydlach();
        kwaczenie = new Kwaczaca();
        plywanie = new Plywam();
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
