package inheritance;

import model.FootType;
import model.Habitat;
import model.Size;

public class Dog extends Animal{

    public Dog() {
        super(Size.SMALL, FootType.CARNIVORES, Habitat.GROUND);
    }

    @Override
    public void move() {
        System.out.println("Я бегаю на земле");
    }

    @Override
    public void eat() {
        System.out.println("Я ем Других жывотнте");
    }

    @Override
    public void sound() {
        System.out.println("Гав! Гав!");
    }
}
