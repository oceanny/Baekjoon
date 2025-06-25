import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        cnt += n / 5;
        int tmp = n % 5;

        if (tmp % 2 == 0) {
            cnt += tmp / 2;
        }
        else if (cnt > 0) {
            cnt--;
            tmp += 5;
            cnt += tmp / 2;
        }
        else {
            cnt = 0;
        }

        if (cnt == 0)
            System.out.println(-1);
        else
            System.out.println(cnt);
    }
}