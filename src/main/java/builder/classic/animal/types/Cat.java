package builder.classic.animal.types;

import builder.classic.animal.Animal;
import builder.classic.animal.AnimalBuilder;
import builder.classic.animal.entities.Environment;
import builder.classic.animal.entities.Food;
import builder.classic.animal.entities.Legs;
import builder.classic.animal.entities.Name;

public class Cat implements AnimalBuilder {

    private Animal animal;

    public Cat() {
        this.animal = new Animal();
    }


    @Override
    public void buildName() {
        Name name = new Name();
        name.setName("Kot");
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
        food.setType("meat");
        food.setKiloPerDay(1);
        animal.setFood(food);
    }

    @Override
    public void buildEnvirment() {
        Environment environment = new Environment();
        environment.setCountry("Poland");
        environment.setType("ground");
        animal.setEnvironment(environment);
    }

    @Override
    public Animal getAnimal() {
        return animal;
    }
}
