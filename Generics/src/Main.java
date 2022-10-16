import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.add(2);
        Week11.sortGeneric(nums);
        Integer x = 4;
        System.out.println(x.compareTo(8));
    }
}