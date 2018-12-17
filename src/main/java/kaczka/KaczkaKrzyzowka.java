package kaczka;

import kaczka.logic.*;

public class KaczkaKrzyzowka extends StandardowaKaczka{
    // @Override nie jest konieczne ale to po prostu dobra praktyka

    public KaczkaKrzyzowka() {
        // this pozwala na wywolanie innego konstruktora w konstruktorze
        // ale to tylko ciekawostka
        // wywolujemy tu konstruktor klasy nadzednej
        super(new LatanieNaSkrzydlach(), new Kwaczaca());
    }
}
