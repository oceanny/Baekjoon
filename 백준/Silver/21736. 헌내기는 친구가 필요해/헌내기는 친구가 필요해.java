import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;
    static int N, M;
    static String[][] campus;
    static boolean[][] visited;
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { 1, 0, -1, 0 };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new String[N][M];
        visited = new boolean[N][M];
        boolean find = false;
        int x = 0, y = 0;

        for (int i = 0; i < N; i++) {
            campus[i] = br.readLine().split("");
            if (!find) {
                for (int j = 0; j < M; j++) {
                    if (campus[i][j].equals("I")) {
                        find = true;
                        x = i; y = j;
                        break;
                    }
                }
            }
        }

        dfs(x, y);
        if (cnt == 0) System.out.println("TT");
        else System.out.println(cnt);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && !campus[nx][ny].equals("X")) {
                if (campus[nx][ny].equals("P")) cnt++;

                dfs(nx, ny);
            }
        }
    }
}