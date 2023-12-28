public class Main {
    public static void main(String[] args) {
    int first = 5;
    int second =6;

    printSum(first,second);
    int sum = getSum(first,second);
        System.out.println("резултат работы метода getSum: " + sum);
    }

    public static void printSum(int firstNumber, int secondnumber){
        int result = firstNumber + secondnumber;
        System.out.println("Резултат сложение двух часом"+ result);
    }

    public static int getSum(int firstNumber, int secondnumber){
        return firstNumber + secondnumber;


    }

}

