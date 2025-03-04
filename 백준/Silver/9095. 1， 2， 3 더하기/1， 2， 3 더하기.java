import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        arr = new int[11];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < T; i++) {
            System.out.println(dp(Integer.parseInt(br.readLine())));
        }
    }

    private static int dp(int n) {
        if (arr[n] == 0) {
            arr[n] = dp(n - 3) + dp(n - 2) + dp(n - 1);
        }
        return arr[n];
    }
}