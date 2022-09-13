public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor using default values.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor using 3 provided args.
     * @param name Student name
     * @param id Student id
     * @param email student email
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * Create student using other student object info.
     * @param s other student object
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    //region getter/setter
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String g) {
        group = g;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }
    //endregion

    public String getInfo() {
        return String.format("%s - %s - %s - %s", name, id, group, email);
    }
}
