import metods.Calculator;
import metods.DefaultCaller;

public class main {
    public static void main(String[] args) {


        System.out.println ("Main class: main started");
        System.out.println("___________________________________");
        Calculator.callPrivateMethod(); // зависла на этой строчки до конца выполнения метода callPrivateMethod
    // после того как java отработала метод callPrivateMethod - она вернулась сюда и продолжила отсюда свою работу

        System.out.println("**********************************");

        DefaultCaller.callDefaultMethodFromCalculator();


    System.out.println("___________________________________");
        System.out.println("Main class: main stoped");

    }
}
