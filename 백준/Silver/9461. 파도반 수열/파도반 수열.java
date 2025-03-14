import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long[] P;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        P = new long[101];
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            dp(N);
            System.out.println(P[N]);
        }
    }

    private static long dp(int n) {
        if (P[n] == 0) {
            P[n] = dp(n - 2) + dp(n - 3);
        }
        return P[n];
    }
}