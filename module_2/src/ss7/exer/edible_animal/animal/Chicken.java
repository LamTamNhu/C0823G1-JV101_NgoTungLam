package ss7.exer.edible_animal.animal;

import ss7.exer.edible_animal.edible.Edible;

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
