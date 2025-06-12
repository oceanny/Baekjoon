import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int len = 64;
        int cnt = 0;
        while (X > 0) {
            if (X < len) {
                len /= 2;
            }
            if (X >= len) {
                X -= len;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}