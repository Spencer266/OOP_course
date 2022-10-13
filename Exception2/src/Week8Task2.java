import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    /**
     * Create null pointer exception.
     * @param str A string
     */
    public void nullPointerEx(String str) throws NullPointerException {
        if (str.equals("Test")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Test null pointer exception.
     * @return Message string
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx(null);
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Create Array Index out of bounds exception.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        Boolean[] check = new Boolean[5];

        System.out.println(check[5]);
    }

    /**
     * Test Array Index out of bounds exception.
     * @return Message string
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException a) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Create Arithmetic exception.
     * @param a number a
     * @param b number b
     * @return a divided by b
     */
    public double arithmeticEx(int a, int b) throws ArithmeticException {
        return a / b;
    }

    /**
     * Test Arithmetic exception.
     * @return Message string
     */
    public String arithmeticExTest() {
        try {
            int a = 3;
            int b = 0;
            arithmeticEx(a, b);
        } catch (ArithmeticException a) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * Create File Not Found exception.
     * @param path file path
     */
    public void fileNotFoundEx(String path) throws IOException, FileNotFoundException {
        FileReader f = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(f);
        char[] buff = new char[100];
        bufferedReader.readLine();
        System.out.println(buff);
    }

    /**
     * Test File Not Found exception.
     * @return Message string
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx("NonExist.txt");
        } catch (FileNotFoundException f) {
            return "Lỗi File Not Found";
        } catch (IOException i) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

    /**
     * Create IO exception.
     * @param path file path
     */
    public void ioEx(String path) throws IOException {
        FileReader f = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(f);
        char[] buff = new char[100];
        bufferedReader.readLine();
        System.out.println(buff);
    }

    /**
     * Test IO exception.
     * @return Message string
     */
    public String ioExTest() {
        try {
            ioEx("NonExist.txt");
        } catch (IOException f) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
