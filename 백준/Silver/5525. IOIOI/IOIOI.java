import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int ans = 0;

        int left = 0;
        int right = 3;
        int cnt = 0;

        while (right <= M) {
            if (S.substring(left, right).equals("IOI")) {
                left += 2;
                right += 2;
                cnt++;
                if (cnt == N) {
                    ans++;
                    cnt--;
                }
            }
            else {
                left++;
                right++;
                cnt = 0;
            }
        }

        System.out.println(ans);
    }
}