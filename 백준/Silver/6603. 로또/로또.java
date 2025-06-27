import java.io.*;
import java.util.*;

public class Main {
    static int k;
    static int[] S;
    static int[] result;
    static StringBuilder sb = new StringBuilder();;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (!str.equals("0")) {
            StringTokenizer st = new StringTokenizer(str);
            k = Integer.parseInt(st.nextToken());
            S = new int[k];
            result = new int[6];
            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }
            search(0, 0);
            sb.append("\n");

            str = br.readLine();
        }

        System.out.println(sb);
    }

    private static void search(int depth, int next) {
        if (depth == 6) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = next; i < k; i++) {
            result[depth] = S[i];
            search(depth + 1, i + 1);
        }
    }
}