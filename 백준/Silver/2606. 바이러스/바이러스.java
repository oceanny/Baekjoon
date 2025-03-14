import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int cnt;
    static int[][] computer;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cnt = 0;
        computer = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            computer[x][y] = 1;
            computer[y][x] = 1;
        }

        dfs(1);
        System.out.println(cnt);
    }

    private static void dfs(int c) {
        visited[c] = true;
        for (int i = 0; i <= N; i++) {
            if (computer[c][i] == 1 && !visited[i]) {
                dfs(i);
                cnt++;
            }
        }
    }
}