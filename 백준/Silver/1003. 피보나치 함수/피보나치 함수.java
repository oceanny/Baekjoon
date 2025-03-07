import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        count = new int[41][2];
        count[0][0] = 1;
        count[1][1] = 1;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(calc(N));
        }
    }

    private static String calc(int n) {
        StringBuilder sb = new StringBuilder();
        count[n][0] = calcZ(n);
        count[n][1] = calcO(n);

        sb.append(count[n][0]).append(" ").append(count[n][1]);

        return sb.toString();
    }

    private static int calcO(int n) {
        if (n > 1 && count[n][1] == 0) count[n][1] = calcO(n - 1) + calcO(n - 2);
        return  count[n][1];
    }

    private static int calcZ(int n) {
        if (n > 1 && count[n][0] == 0) count[n][0] = calcZ(n - 1) + calcZ(n - 2);
        return  count[n][0];
    }
}