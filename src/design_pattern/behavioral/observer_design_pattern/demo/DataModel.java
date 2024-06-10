package design_pattern.behavioral.observer_design_pattern.demo;
import java.util.ArrayList;
import java.util.List;

public class DataModel implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String data;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(data));
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
