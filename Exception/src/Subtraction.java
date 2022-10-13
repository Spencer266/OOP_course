public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        String l = left.toString();
        String r = right.toString();
        if (left instanceof BinaryExpression) {
            l = String.format("(%s)", left.toString());
        }
        if (right instanceof BinaryExpression) {
            r = String.format("(%s)", right.toString());
        }
        return String.format("%s + -%s", l, r);
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
