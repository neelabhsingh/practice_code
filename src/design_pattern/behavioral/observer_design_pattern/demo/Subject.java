package design_pattern.behavioral.observer_design_pattern.demo;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
