package chapterSix.selfAssessment.temperatureConversions;

public class ConvertTemperature {

    public static double convertToKelvin(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }

    public static double convertToCelsius(double temperatureInKelvin) {
        return temperatureInKelvin - 273.15;
    }
}
