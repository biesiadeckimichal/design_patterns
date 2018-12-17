package builder.classic.animal.types;

import builder.classic.animal.Animal;
import builder.classic.animal.AnimalBuilder;
import builder.classic.animal.entities.Environment;
import builder.classic.animal.entities.Food;
import builder.classic.animal.entities.Legs;

public class Falcon implements AnimalBuilder {

    private Animal animal;

    public Falcon() {
        this.animal = new Animal();
    }

    @Override
    public void buildLegs() {
        Legs legs = new Legs();
        legs.setNumber(2);
        animal.setLegs(legs);
    }

    @Override
    public void buildFood() {
        Food food = new Food();
        food.setKiloPerDay(2);
        food.setType("mouse");
        animal.setFood(food);
    }

    @Override
    public void buildEnvirment() {
        Environment environment = new Environment();
        environment.setType("air");
        environment.setCountry("Poland");
        animal.setEnvironment(environment);
    }

    @Override
    public Animal getAnimal() {
        return animal;
    }
}
