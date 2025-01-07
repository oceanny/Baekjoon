import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int ans = check(A) ? Integer.parseInt(A) + 3 : check(B) ? Integer.parseInt(B) + 2 : Integer.parseInt(C) + 1;

        if (ans % 15 == 0) System.out.println("FizzBuzz");
        else if (ans % 3 == 0) System.out.println("Fizz");
        else if (ans % 5 == 0) System.out.println("Buzz");
        else System.out.println(ans);
    }

    public static boolean check(String str) {
        try {
            Integer.parseInt(str);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}