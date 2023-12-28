import loop.Counter;

public class Main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter ("firstCounter", "Hello I am first counter")
      firstCounter.count(5);
      firstCounter.printName();

        System.out.println("--------------");

        Counter secondCounter = new Counter("Hello, I am second count");
        secondCounter.count(3);
       secondCounter.printName();

        System.out.println("--------------");

        Counter thirdCount = firstCounter;
        thirdCount.count(1);
        thirdCount.printName();
    }
}
