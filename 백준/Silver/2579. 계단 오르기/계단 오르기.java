import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stairs = new int[N + 1];
        int[] sum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        sum[1] = stairs[1];

        if (N > 1) sum[2] = sum[1] + stairs[2];

        for (int i = 3; i <= N; i++) {
            sum[i] = Math.max(sum[i - 2], sum[i - 3] + stairs[i - 1]) + stairs[i];
        }

        System.out.println(sum[N]);
    }
}