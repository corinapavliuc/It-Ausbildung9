package termomenter;

import java.util.Scanner;

public class TemTypeInput {
    public int userTempChoice(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("pojalosta viberete tip temperaturaa: ");
        System.out.println("1. iz telsiea - vi farengeit: ");
        System.out.println("2. iz farengeita - vi telsia: ");

        int typeOfConverter = scanner.nextInt();
        return typeOfConverter;
    }
}
