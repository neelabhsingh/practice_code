package design_pattern.creational.builder_design_pattern.demo1;
public class House {
    private int floors;
    private  int rooms;
    private boolean hasGarden;
    private boolean hasPool;
    private boolean hasGarage;

    private House() {
        // private constructor to enforce object creation through builder
    }

    public static class Builder {
        private House house;
        public static Builder newInstance() {
            return new Builder();
        }

        public Builder() {
            house = new House();
        }

        public Builder setFloors(int floors) {
            house.floors = floors;
            return this;
        }

        public Builder setRooms(int rooms) {
            house.rooms = rooms;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            house.hasGarden = hasGarden;
            return this;
        }

        public Builder setHasPool(boolean hasPool) {
            house.hasPool = hasPool;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            house.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return house;
        }
    }
}


