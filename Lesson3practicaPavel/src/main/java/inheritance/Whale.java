package inheritance;

import model.FootType;
import model.Habitat;
import model.Size;

public class Whale extends Animal{

    public Whale(Size size ) {
        super(size, FootType.CARNIVORES,Habitat.WATER);
    }

    @Override
    public void move() {
        System.out.println("я плаваю в воде");
    }

    @Override
    public void eat() {
        System.out.println("я ем других жывотние");

    }

    @Override
    public void sound() {
        System.out.println("yyyyyy");
    }
}
