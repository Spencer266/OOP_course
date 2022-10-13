public class Car extends Vehicle {
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    private int numberOfDoors;

    public Car(String brand, String model, String rn, Person owner, int numberOfDoors) {
        super(brand, model, rn, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        StringBuilder res = new StringBuilder("Car:\n");
        res.append(String.format("\tBrand: %s\n", brand));
        res.append(String.format("\tModel: %s\n", model));
        res.append(String.format("\tRegistration Number: %s\n", registrationNumber));
        res.append(String.format("\tNumber of Doors: %d\n", numberOfDoors));
        res.append(String.format("\tBelongs to %s - %s\n", owner.getName(), owner.getAddress()));
        return res.toString();
    }
}
