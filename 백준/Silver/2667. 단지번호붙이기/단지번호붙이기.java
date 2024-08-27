import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int[][] apt;
	static boolean[][] visited;
	static List<Integer> list;
	static int N, cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		list = new ArrayList<>();
		apt = new int[N][N];
		visited = new boolean[N][N];
		cnt = 1; // 탐색할 첫 아파트 포함
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				apt[i][j] = Integer.parseInt(str.substring(j, j + 1));
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j] && apt[i][j] == 1) {
					DFS(i, j);
					list.add(cnt);
					cnt = 1; // count 초기화
				}
			}
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for (int l : list) sb.append(l).append("\n");
		
		System.out.println(sb);
	}
	private static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			
			if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && apt[nx][ny] == 1) {
				cnt++;
				DFS(nx, ny);
			}
		}
	}
}