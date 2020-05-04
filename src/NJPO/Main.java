package NJPO;

public class Main {

    public static void main(String[] args) {
	    TemperatureSensor sensor = new TemperatureSensor();
	    CelsiuszDisplay celsius = new CelsiuszDisplay(sensor);
	    FahrenheitDisplay fahrenheit = new FahrenheitDisplay(sensor);
	    KelwinDisplay kelwin = new KelwinDisplay(sensor);

	    sensor.addObserver(celsius);
        sensor.addObserver(fahrenheit);
        sensor.addObserver(kelwin);

        sensor.set(20);
    }
}
