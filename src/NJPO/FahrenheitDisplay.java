package NJPO;

public class FahrenheitDisplay implements Observer {
    private TemperatureSensor sensor = null;

    public FahrenheitDisplay(TemperatureSensor cz) {
        sensor = cz;
    }

    @Override
    public void update(Observable ob) {
        if(ob == sensor) {
            double tempFahrenheit = sensor.getTemperature() * 1.8 + 32;
            System.out.println(tempFahrenheit + " F");
        }
    }
}
