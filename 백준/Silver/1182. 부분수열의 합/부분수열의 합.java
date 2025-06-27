import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int S;
    static int[] arr;
    static int[] sum;
    static int count = 0;
    static int ea;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            ea = i;
            sum = new int[i];
            search(0, 0);
        }
        System.out.println(count);
    }

    private static void search(int depth, int next) {
        if (depth == ea) {
            int tmp = 0;
            for (int i : sum) {
                tmp += i;
            }

            if (tmp == S)
                count++;

            return;
        }

        for (int i = next; i < N; i++) {
            sum[depth] = arr[i];
            search(depth + 1, i + 1);
        }
    }
}