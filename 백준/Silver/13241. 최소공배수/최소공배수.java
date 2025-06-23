import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long R;
        if (A > B) R = gcd(A, B);
        else R = gcd(B, A);

        System.out.println(A * B / R);
    }

    private static long gcd(long a, long b) {
        if (a % b != 0) return gcd(b, a % b);
        else return b;
    }
}