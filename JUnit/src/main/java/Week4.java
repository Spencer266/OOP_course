import java.util.Arrays;

public class Week4 {

    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    public static int minArray (int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    public static String calculateBMI(double weight, double height){
        double scale = Math.pow(10, 2);
        double BMI = weight/Math.pow(height, 2);
        BMI = Math.round(BMI * scale) / scale;

        if (BMI < 18.5f) { return "Thiếu cân"; }
        else if (BMI >= 18.5f && BMI <= 22.9f) { return "Bình thường"; }
        else if (BMI >= 23f && BMI <= 24.9f) { return "Thừa cân"; }
        else { return "Béo phì"; }
    }

    public static void main(String[] args) {

    }
}
