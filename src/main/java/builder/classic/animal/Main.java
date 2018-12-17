package builder.classic.animal;

import builder.classic.animal.types.Cat;
import builder.classic.animal.types.Dog;
import builder.classic.animal.types.Turtle;

public class Main {
    public static void main(String[] args) {
        AnimalBuilder dogAnimalBuilder = new Dog();
        AnimalEngineer dogDirector = new AnimalEngineer(dogAnimalBuilder);
        dogDirector.buildAnimal();
        Animal dog = dogDirector.getAnimal();
        System.out.println(dog);

        AnimalBuilder turtleAnimalBuilder = new Turtle();
        AnimalEngineer turtleAnimalEngineer = new AnimalEngineer(turtleAnimalBuilder);
        turtleAnimalEngineer.buildAnimal();
        Animal turtle = turtleAnimalEngineer.getAnimal();
        System.out.println(turtle);

        AnimalBuilder catAnimalBuilder = new Cat();
        AnimalEngineer catAnimalEngineer = new AnimalEngineer(catAnimalBuilder);
        catAnimalEngineer.buildAnimal();
        Animal cat = catAnimalEngineer.getAnimal();
        System.out.println(cat);
    }

}
