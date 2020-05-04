package NJPO;

public class TemperatureSensor implements Observable {
    private double temperature = 0;

    public double getTemperature() {
        return temperature;
    }

    public void set(double temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void removeObserver() {
        observers.clear();
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(this);
        }
    }
}
