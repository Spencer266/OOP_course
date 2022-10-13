public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        boolean cmp = false;
        String l = left.toString();
        String r = right.toString();
        if (left instanceof BinaryExpression) {
            l = String.format("(%s)", left.toString());
            cmp = true;
        }
        if (right instanceof BinaryExpression) {
            r = String.format("(%s)", right.toString());
            cmp = true;
        }
        if (cmp) {
            return String.format("(%s + %s)", l, r);
        }
        return String.format("%s + %s", l, r);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
