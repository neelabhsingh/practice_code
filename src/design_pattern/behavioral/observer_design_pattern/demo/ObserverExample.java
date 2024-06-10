package design_pattern.behavioral.observer_design_pattern.demo;

public class ObserverExample {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        UserInterface ui1 = new UserInterface("UI1");
        UserInterface ui2 = new UserInterface("UI2");
        model.registerObserver(ui1);
        model.registerObserver(ui2);
        model.setData("Testing.");
        model.notifyObserver();
    }
}
