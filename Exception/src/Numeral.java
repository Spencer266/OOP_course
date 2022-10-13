public class Numeral extends Expression {
    private double value;

    public Numeral() {
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String res = Integer.toString((int) value);
        return res;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
