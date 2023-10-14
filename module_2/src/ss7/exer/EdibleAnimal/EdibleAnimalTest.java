package ss7.exer.EdibleAnimal;

import ss7.exer.EdibleAnimal.animal.Animal;
import ss7.exer.EdibleAnimal.animal.Chicken;
import ss7.exer.EdibleAnimal.animal.Tiger;
import ss7.exer.EdibleAnimal.fruit.Apple;
import ss7.exer.EdibleAnimal.fruit.Fruit;
import ss7.exer.EdibleAnimal.fruit.Orange;

public class EdibleAnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
