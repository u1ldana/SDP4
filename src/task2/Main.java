package task2;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherDisplay currentDisplay = new CurrentConditionsDisplay();
        station.addObserver(currentDisplay);

        station.setMeasurements(20, 65, 1013);
        station.setMeasurements(25, 70, 1009);
    }
}

