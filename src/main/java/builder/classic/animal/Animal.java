package builder.classic.animal;

import builder.classic.animal.entities.Environment;
import builder.classic.animal.entities.Food;
import builder.classic.animal.entities.Legs;
import builder.classic.animal.entities.Name;

public class Animal {
    private Environment environment;
    private Food food;
    private Legs legs;
    private Name name;

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public void setName(Name name) {
        this.name = name;
    }

}
