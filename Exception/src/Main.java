public class Main {
    public static void main(String[] args) {
        Addition a = new Addition(new Numeral(3), new Numeral(4));
        System.out.println(a.toString());
        Division b = new Division(a, new Numeral(0));
        System.out.println(b.toString());
        System.out.println(b.evaluate());
    }
}