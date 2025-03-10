import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] ground = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int time = Integer.MAX_VALUE;
        int height = -1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                ground[i][j] = tmp;

                if (tmp > max) max = tmp;
                if (tmp < min) min = tmp;
            }
        }

        for (int i = min; i <= max; i++) {
            int tmpTime = 0;
            int inventory = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int tmp = ground[j][k] - i;
                    if (tmp > 0) tmpTime += tmp * 2;
                    else if (tmp < 0) tmpTime -= tmp;

                    inventory += tmp;
                }
            }

            if (inventory >= 0 && tmpTime <= time) {
                time = tmpTime;
                height = i;
            }
        }

        System.out.printf("%d %d", time, height);
    }
}