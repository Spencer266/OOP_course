import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

            int x = 0;
            int y;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
            System.out.println(x/y);
    }
}