import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * List vehicle infos.
     * @return String of list
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return String.format("%s has no vehicle!", name);
        }
        StringBuilder res = new StringBuilder(String.format("%s has:\n\n", name));
        for (Vehicle v: vehicleList) {
            res.append(v.getInfo());
        }
        return res.toString();
    }
}
