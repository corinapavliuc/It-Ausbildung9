package termomenter;

public class TemperatureConverter {

    public double fromCelsiumToFahrenheit(double celsiumTemp) {
        double fahrTemp = celsiumTemp * 1.8 + 32;
        return fahrTemp;
    }

    public double fromCelsiumToCelsius(double celsiumTemp) {
        double celsiusTemp = (-32) / 1.8;
        return celsiumTemp;
    }
}
