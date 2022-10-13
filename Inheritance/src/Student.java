public class Student extends Person {

    /**
     * Student Constructor.
     * @param name student name
     * @param address address
     * @param program program
     * @param year year enrolled
     * @param fee study fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    private String program;
    private int year;
    private double fee;

    @Override
    public String toString() {
        String sup = super.toString();
        return String.format("Student[%s,program=%s,year=%d,fee=%.1f]", sup, program, year, fee);
    }
}
