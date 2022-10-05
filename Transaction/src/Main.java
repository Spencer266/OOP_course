public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(3000.68, "deposit");
        acc.addTransaction(3000, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.addTransaction(2000, "withdraw");
        acc.printTransaction();
    }
}
