import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] square;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        square = new long[n + 1];
        square[1] = 1;
        if (n > 1) {
            square[2] = 3;
        }

        dp(n);

        System.out.println(square[n] % 10007);
    }

    private static long dp(int n) {
        if (square[n] == 0) {
            square[n] = dp(n -1) % 10007 + dp(n - 2) % 10007 * 2;
        }

        return square[n];
    }
}