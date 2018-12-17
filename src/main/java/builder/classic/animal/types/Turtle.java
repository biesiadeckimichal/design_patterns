package builder.classic.animal.types;

import builder.classic.animal.Animal;
import builder.classic.animal.AnimalBuilder;
import builder.classic.animal.entities.Environment;
import builder.classic.animal.entities.Food;
import builder.classic.animal.entities.Legs;

public class Turtle implements AnimalBuilder {

    private Animal animal;

    public Turtle() {
        this.animal = new Animal();
    }

    @Override
    public void buildLegs() {
        Legs legs = new Legs();
        legs.setNumber(4);
        animal.setLegs(legs);
    }

    @Override
    public void buildFood() {
        Food food = new Food();
        food.setType("plants");
        food.setKiloPerDay(5);
        animal.setFood(food);
    }

    @Override
    public void buildEnvirment() {
        Environment environment = new Environment();
        environment.setCountry("Australia");
        environment.setType("sea");
        animal.setEnvironment(environment);
    }

    @Override
    public Animal getAnimal() {
        return animal;
    }
}
