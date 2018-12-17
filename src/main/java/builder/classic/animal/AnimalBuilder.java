package builder.classic.animal;

public interface AnimalBuilder {
    void buildName();
    void buildLegs();
    void buildFood();
    void buildEnvirment();
    Animal getAnimal();

}
