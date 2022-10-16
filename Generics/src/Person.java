import java.util.Comparator;

public class Person implements Comparable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private int age;
    private String address;

    /**
     * Default constructor.
     */
    public Person() {
        name = "default";
        age = 0;
        address = "default";
    }

    /**
     * Constructor 3-params.
     * @param name name
     * @param age age
     * @param address address
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return Comparator.comparing(Person::getName)
                .thenComparingInt(Person::getAge)
                .compare(this, p);
    }
}
