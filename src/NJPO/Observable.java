package NJPO;

import java.util.ArrayList;

public interface Observable {
    ArrayList<Observer> observers = new ArrayList<>();

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void removeObserver();
    void notifyObserver();

}
