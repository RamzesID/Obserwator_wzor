package NJPO;

public class KelwinDisplay implements  Observer{
    private TemperatureSensor sensor = null;

    public KelwinDisplay(TemperatureSensor cz) {
        sensor = cz;
    }

    @Override
    public void update(Observable ob) {
        if(ob == sensor) {
            double tempKelwin = ((TemperatureSensor)ob).getTemperature() + 273.15;
            System.out.println(tempKelwin + " K");
        }
    }
}
