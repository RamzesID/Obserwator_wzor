package NJPO;

public class CelsiuszDisplay implements Observer {
    private TemperatureSensor sensor = null;

    public CelsiuszDisplay(TemperatureSensor cz) {
        sensor = cz;
    }

    @Override
    public void update(Observable ob) {
        if(ob == sensor)
        System.out.println(sensor.getTemperature() + " C");
    }
}
