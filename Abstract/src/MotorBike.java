public class MotorBike extends Vehicle {
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }

    private boolean hasSidecar;

    public MotorBike(String brand, String model, String rn, Person owner, boolean hasSideCar) {
        super(brand, model, rn, owner);
        this.hasSidecar = hasSideCar;
    }

    @Override
    public String getInfo() {
        StringBuilder res = new StringBuilder("Motor Bike:\n");
        res.append(String.format("\tBrand: %s\n", brand));
        res.append(String.format("\tModel: %s\n", model));
        res.append(String.format("\tRegistration Number: %s\n", registrationNumber));
        res.append(String.format("\tHas Side Car: %b\n", hasSidecar));
        res.append(String.format("\tBelongs to %s - %s\n", owner.getName(), owner.getAddress()));
        return res.toString();
    }
}
