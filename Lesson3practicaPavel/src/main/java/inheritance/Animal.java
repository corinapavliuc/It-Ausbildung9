package inheritance;

import model.FootType;
import model.Habitat;
import model.Size;

public  abstract class Animal {

    private final Size size;
    private final FootType footType;
    private final Habitat habitat;

    public Animal(Size size, FootType footType, Habitat habitat) {
        this.size = size;
        this.footType = footType;
        this.habitat = habitat;
    }

    public abstract void move();

    public abstract void eat();

    public abstract void sound();

    public void breathe(){
        System.out.println("I love breather,I love you");
    }

}
