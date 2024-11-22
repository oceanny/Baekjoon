import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean[][] food;
	static boolean[][] visited;
	static int N;
	static int M;
	static int check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int ans = 0;
		
		food = new boolean[N + 1][M + 1];
		visited = new boolean[N + 1][M + 1];
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			food[r][c] = true;
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (!visited[i][j] && food[i][j]) {
					check = 0;
					check_food(i, j);
					ans = Math.max(ans, check);
				}
			}
		}
        
		System.out.println(ans);
	}
    
	private static void check_food(int i, int j) {
		check++;
		visited[i][j] = true;
		for (int k = 0; k < 4; k++) {
			int ni = i + dx[k];
			int nj = j + dy[k];
			
			if (ni > 0 && ni <= N && nj > 0 && nj <= M) {
				if (!visited[ni][nj] && food[ni][nj]) {
					check_food(ni, nj);
				}
			}
		}
	}
}