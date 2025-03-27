import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] num = new int[9];

        for (int i = 0; i < N.length(); i++) {
            int n = N.charAt(i) - '0';
            if (n == 9) n = 6;
            num[n]++;
        }

        num[6] = (num[6] + 1) / 2;

        int max = 0;

        for (int j : num) {
            if (j > max) max = j;
        }

        System.out.println(max);
    }
}