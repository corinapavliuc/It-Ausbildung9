public class Main {
    public static void main(String[] args) {
        int firstNumber =4;
        int secondNumber =8;

        int result =sumTwoNumber(firstNumber,secondNumber);
        assertEqualsNumbers(result,12);
        assertEqualsNumbers(result,14);
    }

    public static int sumTwoNumber(int first ,int second) {
        return first+second;

    }
    public static void assertEqualsNumbers(int expectedNum,int targetNum){
     if (expectedNum == targetNum){
         System.out.println("числа равны");
     }else{
         System.err.println("Числа не равны");
     }
    }
}