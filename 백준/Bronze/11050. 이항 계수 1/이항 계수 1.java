import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] binomial;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        binomial = new int[N + 1][K + 1];
        System.out.println(getBinomial(N, K));
    }

    public static int getBinomial(int N, int K) {
        if (N == K || K == 0) {
            binomial[N][K] = 1;
        }
        if (binomial[N][K] == 0 && K < N) {
            binomial[N][K] = getBinomial(N - 1,K - 1) + getBinomial(N - 1, K);
        }

        return binomial[N][K];
    }
}