package design_pattern.behavioral.observer_design_pattern.demo;

public class UserInterface implements Observer{
    private String uiName;
    public UserInterface(String uiName){
        this.uiName = uiName;
    }
    public void update(String data){
        System.out.println("UI "+ uiName + "received data :"+ data);
    }
}
