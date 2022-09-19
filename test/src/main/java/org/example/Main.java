package org.example;

public class Main {

    /**
     * Tim uoc chung lon nhat cua hai so.
     * @param a so thu nhat
     * @param b so thu hai
     * @return Uoc chung lon nhat cua hai so
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == b) {
            return a;
        }
        if (a == 0 || b == 0) {
            return Math.abs(a - b);
        }
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(Integer.MAX_VALUE, 10));
    }
}