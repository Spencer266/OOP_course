public class Staff extends Person {

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    private String school;
    private double pay;

    /**
     * Staff Constructor.
     * @param name name
     * @param address address
     * @param school school name
     * @param pay payment
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        String sup = super.toString();
        return String.format("Staff[%s,school=%s,pay=%.1f]", sup, school, pay);
    }
}
