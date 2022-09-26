public class Solution {

    private long[] fibo = new long[101];


    /**
     * Kiem tra mot so co phai la so nguyen to.
     * @param n So n de kiem tra
     * @return Co phai so nguyen to hay khong
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if ((n == 2) || (n == 3)) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Solution x = new Solution();
        if (x.isPrime(41)) System.out.println("true");
        else System.out.println("false");
    }

}
