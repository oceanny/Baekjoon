import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int M, N;
	
	static int[][] field;
	static	boolean[][] visited;
	
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			field = new int[M][N];
			visited = new boolean[M][N];
			int cnt = 0;
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					field[j][k] = 0;
				}
			}
			
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					if (!visited[j][k] && field[j][k] == 1) {
						DFS(j, k);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	private static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if (nx >= 0 && ny >= 0 && nx < M && ny < N && !visited[nx][ny] && field[nx][ny] == 1) DFS(nx, ny);
		}
	}
}