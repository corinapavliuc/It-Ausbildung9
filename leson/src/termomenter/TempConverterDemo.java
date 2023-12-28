package termomenter;

import java.util.Scanner;

public class TempConverterDemo {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("pojalosta viberete tip temperaturaa: ");
        System.out.println("1. iz telsiea - vi farengeit: ");
        System.out.println("2. iz farengeita - vi telsia: ");

        int typeOfConverter = scanner.nextInt();

        double tempConverterResult = 0;
        if (typeOfConverter == 1) {
            System.out.println("vivadite dannie temperatura si gradusah telsia: ");
            double celsiusTemp = scanner.nextDouble();
            tempConverterResult = converter.fromCelsiumToFahrenheit(celsiusTemp);

            System.out.println("Vasa temperatura : ");
            System.out.println(celsiusTemp + "gradusov telsia");
            System.out.println(tempConverterResult + "gradusov frarengeita");
        }

        if (typeOfConverter == 2) {
            System.out.println("vivadite dannie temperatura si gradusov farengiea: ");
            double fahrTemp = scanner.nextDouble();
            tempConverterResult = converter.fromCelsiumToFahrenheit(fahrTemp);

            System.out.println("Vasa temperatura : ");
            System.out.println(fahrTemp + "gradusov telsia");
            System.out.println(tempConverterResult + "gradusov frarengeita");
        }
        if (typeOfConverter < 1 || typeOfConverter > 2) {
            System.out.println("necotorii vibor");
        }
    }
}
