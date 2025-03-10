import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append("I");
        int cnt = 1;
        while (cnt <= N) {
            sb.append("OI");
            cnt++;
        }
        String str = sb.toString();
        int ans = 0;

        for (int i = 0; i < M; i++) {
            if (i == M - 2 * N) break;
            String tmp = S.substring(i, i + 2 * N + 1);
            if (tmp.equals(str)) ans++;
        }

        System.out.println(ans);
    }
}