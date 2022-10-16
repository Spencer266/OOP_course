import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11 {
    public static <T extends Comparable> List<T> sortGeneric(List<T> arr) {
        Collections.sort(arr);
        return arr;
    }
}
