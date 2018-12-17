package kaczka;

import java.util.ArrayList;
import java.util.List;

// skroty
// iter tworzy foreach lub kaczka.iter
// ctr i w dol tworzy dodatkowe kursory
// solid
// s -
// o -
// l - list of oznacza ze do instancji mozemy uzyc zarowno kaczkekrzyzowke jak
// po prostu kaczke2
// i
// d - dependency in version wysokopoziomowe moduly nie powinny zalezec od
// niskopoziomowych

// dziedziczenie przekazuje wszystkie zachowania i wlasciwosci, ale dziedziczyc
// mozemy tylko po jednej klasie
// kompozycja pozwala na "dziedziczenie" z kilku klas lub interfacow
public class Main {
    public static void main(String[] args) {
        Kaczka kaczka1 = new CyraneczkaKarolinska();
        Kaczka kaczka2 = new KaczkaKrzyzowka();
        Kaczka kaczka3 = new GumowaKaczuszka();

        List<Kaczka> kaczki = new ArrayList<>();
        kaczki.add(kaczka1);
        kaczki.add(kaczka2);
        kaczki.add(kaczka3);

        for (Kaczka kaczka : kaczki) {
            kaczka.kwacz();
            kaczka.plywaj();
            kaczka.lataj();

        }
    }
}
