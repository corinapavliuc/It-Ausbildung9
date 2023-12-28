import inheritance.Dog;
import inheritance.Whale;
import model.Size;

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale(Size.BIG);
        doAll(whale);
        Dog dog = new Dog();
        doAll(dog);


        private static void doAll(Dog dog){
            whale.eat();
            whale.sound();
            whale.move();
            whale.breathe();
        }

        private static void doAll(Whale whale){
            whale.eat();
            whale.sound();
            whale.move();
            whale.breathe();
        }
    }
}

