package design_pattern.creational.factory.demo1;

// Abstract Products
interface Button{
    void render();
}
interface Window{
    void render();
    void setTitle(String title);
}
//Abstract Factory
interface GUIFactory{
    Button createButton();
    Window createWindow();
}

//Create Product
class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("Render WindowButton");
    }
}
class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Render MacButton");
    }
}
class WindowsWindow implements Window{
    @Override
    public void render() {
        System.out.println("Rendering Windows window");
    }

    @Override
    public void setTitle(String title) {
        System.out.println("Setting Windows title :"+ title);
    }
}
class MacWindow implements Window{
    @Override
    public void render() {
        System.out.println("Rendering Windows window");
    }

    @Override
    public void setTitle(String title) {
        System.out.println("Setting window tile"+ title);
    }
}
public class Application {
    public static void main(String[] args) {

    }
}

