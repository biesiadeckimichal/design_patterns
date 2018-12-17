package builder.fluent.burger;

// konstruktor bulidera jest w burgerze wiec dostep do niego jest tylko w klasie
// burger, nigdzie indziej, w ten sposob zabezpieczamy wszystko przed innym wywolaniem
// niz w klasie burger
public class Burger {
    // string jest immutable, czyli klasa tworzaca obiekty nie zmienne
    // to samo robi final
    // czyli "ala" + "ma kota" tworzy dwie instancje
    // typu string, a nie zmienia pierwszy string dodajac do niego "ma kota"
    // na koniec dodajemy final tak zeby nikt juz nam nie zmieninl burgera
    // po jego zamowieniu
    private final BreadType bread;
    private final String meat;
    private final String salad;
    private final String cheese;
    private final String sauce;
    private final boolean withBacon;
    // ctrl i strzalka ustawia strzalke na koniec wyrazu
    // przydatne przy wielu karetkach

    // ten konstruktor tworzymy dlatego ze nie chcemy moc tworzyc
    // instancji burgera przez new burger, tylko przez buildera
    // domyslnie jest public Burger(){}, dlatego musimy go nadpisac
    // poprzez przygotowanie jakiegokolwiek nowego konstruktora
    private Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.salad = builder.salad;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.withBacon = builder.withBacon;
    }


    public BreadType getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isWithBacon() {
        return withBacon;
    }


    // metoda zwracajaca Builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private BreadType bread;
        private String meat;
        private String salad;
        private String cheese;
        private String sauce;
        private boolean withBacon;

        // ponizej tworzymy konstruktor prywatny widoczny tylko w klasie burger
        // ogolnie klasa Builder bedzie widoczna na zewnatrz
        // ale sam konstruktor tylko w burgerze
        private Builder() {

        }

        // aby uzyskac fluent interface czyli mozliwosc wywolywania
        // metod po kropce w jednym ciagu tworzymy ponizsza metode
        public Builder bread(BreadType bread) {
            this.bread = bread;
            // this to jest obiekt w ktorym aktualnie jestesmy czyli w
            // builderze ktory tworzymy
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public Builder salad(String salad){
            this.salad = salad;
            return this;
        }

        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public Builder withBacon(boolean withBacon) {
            this.withBacon = withBacon;
            return this;
        }
        // dopisac druga metode

        // tworzymy publiczna metode do tworzenia burgera
        // zwracamy nowa instancje burger, na podstawie builder
        // przez this przekazujemy wszystko co jest powzyej
        // a wiec cale tworzenie burgera w builderze, wszystkie dadatki
        public Burger build() {
            // dodajemy przez alt enter
            return new Burger(this);
        }
    }


    @Override
    public String toString() {
        return "Burger{" +
                "bread=" + bread +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                ", withBacon=" + withBacon +
                '}';
    }
}
