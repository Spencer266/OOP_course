public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
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
        return String.format("%s / %s", l, r);
    }

    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
