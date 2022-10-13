public abstract class Vehicle {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Vehicle Constructor.
     * @param brand Brand
     * @param model Model
     * @param registrationNumber Registration number
     * @param owner Owner of vehicle
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Transfer ownership of vehicle to someone else.
     * @param newOwner New Owner
     */
    public void transferOwnership(Person newOwner) {
        owner.removeVehicle(registrationNumber);
        owner = newOwner;
    }

    public abstract String getInfo();
}
