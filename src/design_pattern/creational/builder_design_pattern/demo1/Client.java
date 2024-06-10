package design_pattern.creational.builder_design_pattern.demo1;

public class Client {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setFloors(2)
                .setRooms(3)
                .setHasGarden(true)
                .setHasPool(false)
                .setHasGarage(true)
                .build();
    }
}
