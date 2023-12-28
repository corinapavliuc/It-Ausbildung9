package scanner;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Введите первое число:");
   int firstNumber = scanner.nextInt();
   System.out.println("Введите второе число: ");
   int secondNumber = scanner.nextInt();

   int result = firstNumber + secondNumber;

   System.out.println(firstNumber + secondNumber);
   System.out.println("------");
   System.out.println(result);
   //---- Calculator de calculat am creat
    }
}
