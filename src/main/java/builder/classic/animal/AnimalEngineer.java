package builder.classic.animal;

public class AnimalEngineer {

    private AnimalBuilder animalBuilder;

    public AnimalEngineer(AnimalBuilder animalBuilder) {
        this.animalBuilder = animalBuilder;
    }

    public void buildAnimal() {
        animalBuilder.buildEnvirment();
        animalBuilder.buildFood();
        animalBuilder.buildLegs();
        animalBuilder.buildName();
    }

    public Animal getAnimal() {
        return this.animalBuilder.getAnimal();
    }




}
