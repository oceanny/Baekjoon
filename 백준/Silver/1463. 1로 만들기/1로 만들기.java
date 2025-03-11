import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        cnt = new int[X + 1];

        cnt[1] = 0;

        System.out.println(calc(X));
    }

    private static int calc(int x) {
        if (x < 2 || cnt[x] > 0) return cnt[x];

        if (x % 6 == 0) {
            cnt[x] = Math.min((Math.min(calc(x / 3), calc(x / 2))), calc(x - 1)) + 1;
        }
        else if (x % 3 == 0) {
            cnt[x] = Math.min(calc(x / 3), calc(x - 1)) + 1;
        }
        else if (x % 2 == 0) {
            cnt[x] = Math.min(calc(x / 2), calc(x - 1)) + 1;
        }
        else {
            cnt[x] = calc(x - 1) + 1;
        }

        return cnt[x];
    }
}