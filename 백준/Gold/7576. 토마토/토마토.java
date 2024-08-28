import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] box;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static Queue<int[]> que;
	static int M, N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		box = new int[N][M];
		que = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if (box[i][j] == 1) que.add(new int[] {i, j});
			}
		}
		
		System.out.println(BFS());
	}

	private static int BFS() {
		while (!que.isEmpty()) {
			int[] temp = que.poll();
			int x = temp[0];
			int y = temp[1];
			
			for (int i = 0; i < 4; i++) {
				int nx = dx[i] + x;
				int ny = dy[i] + y;
				
				if (nx >= 0 && ny >= 0 && nx < N && ny < M && box[nx][ny] == 0) {
					que.add(new int[] {nx, ny});
					box[nx][ny] = box[x][y] + 1;
				}
			}
		}
		
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) return -1;
				if (box[i][j] > cnt) cnt = box[i][j];
			}
		}
		
		if (cnt == 1) return 0;
		else return cnt - 1;
	}
}