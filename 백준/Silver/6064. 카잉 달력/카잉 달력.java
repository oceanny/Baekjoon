import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int max = M * N / gcd(M, N);
            int cnt = x;
            int nx = 0, ny = 0;

            while (ny != y) {
                nx = cnt % M == 0 ? M : cnt % M;
                ny = cnt % N == 0 ? N : cnt % N;
                cnt += M;

                if (cnt >= max) break;
            }

            if (nx == x && ny == y) System.out.println(cnt - M);
            else System.out.println(-1);
        }
    }

    private static int gcd(int m, int n) {
        while (n != 0) {
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return m;
    }
}