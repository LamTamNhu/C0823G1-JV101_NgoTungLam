package ss7.exer.EdibleAnimal.animal;

import ss7.exer.EdibleAnimal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken sounds: cuck cuck";
    }

    @Override
    public String howToEat() {
        return "Chicken can be grilled";
    }
}
