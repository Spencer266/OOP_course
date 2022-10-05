import java.util.ArrayList;

public class Account {

    public double getBalance() {
        return balance;
    }

    private double balance;

    private ArrayList<Transaction> transitionList = new ArrayList<>();

    public Account() {
        balance = 0;
    }

    /**
     * Nap tien vao tai khoan (deposit).
     * @param amount So luong tien nap
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
    }

    /**
     * Rut tien tu tai khoan.
     * @param amount So luong tien rut
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
    }

    /**
     * Them giao dich vao tai khoan.
     * @param amount So luong tien
     * @param operateType Loai giao dich
     */
    public void addTransaction(double amount, final String operateType) {
        if (operateType.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operateType.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        Transaction trans = new Transaction(operateType, amount, balance);
        transitionList.add(trans);
    }

    /**
     * In lich su giao dich cua tai khoan.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction t: transitionList) {
            String str;
            double a = t.getAmount();
            double b = t.getBalance();
            if (t.getOperation().equals(Transaction.DEPOSIT)) {
                str = String.format("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.", i, a, b);
            } else {
                str = String.format("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.", i, a, b);
            }
            System.out.println(str);
            i++;
        }
    }
}
