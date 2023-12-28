public class UnaryTest {
    public static void main(String[] args) {
        int a = 5;
        a++;
        a--;

       int b =a--;
       int c =--a;

        System.out.println(a);
        int firstNumber, secondnumber,thirdNumber;
        firstNumber =12;
        secondnumber=7;
        thirdNumber =19;

        int fourthNumber=12 ;
        System.out.println(firstNumber== secondnumber);
        System.out.println(firstNumber== fourthNumber);
        System.out.println(secondnumber> thirdNumber);
        System.out.println(thirdNumber> fourthNumber);

    }
}
