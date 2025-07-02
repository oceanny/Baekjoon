import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][4];
        int index = 0;
        int rank = 1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());

            if (arr[i][0] == K)
                index = i;
        }

        for (int i = 0; i < N; i++) {
            if (arr[i][1] > arr[index][1])
                rank++;
            else if (arr[i][1] == arr[index][1] && arr[i][2] > arr[index][2])
                rank++;
            else if (arr[i][1] == arr[index][1] && arr[i][2] == arr[index][2] && arr[i][3] > arr[index][3])
                rank++;
        }

        System.out.println(rank);
    }
}