import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// dx, dy 정의 -> 상/좌/하/우로 이동
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited; // 방문 배열
	static int[][] A; // 미로 배열
	static int n, m; // bfs에서 사용해야 하므로 미리 static으로 선언
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 가로 데이터 개수
		m = Integer.parseInt(st.nextToken()); // 세로 데이터 개수
		
		visited = new boolean[n][m];
		A = new int[n][m];
		
		// 미로 배열 저장
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		// BFS 실행 : 첫번째 지점에서 출발하므로 (0, 0)을 입력
		BFS(0, 0);
		// 마지막 칸의 깊이가 최소 칸 수
		System.out.println(A[n - 1][m - 1]);
	}
	private static void BFS(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] {i, j});
		visited[i][j] = true;
		// !isEmpty -> bfs가 불가능할 때까지 반복
		while (!que.isEmpty()) {
			// 시작 지점을 now 배열에 삽입
			int[] now = que.poll();
			// dx, dy 상하좌우 탐색 -> k는 4 미만
			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 배열의 범위 안에서 탐색
				if (x >= 0 && y >= 0 && x < n && y < m) {
					// 0이 아니고 방문하지 않은 곳에서 탐색
					if (A[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true; // 방문 배열 변경
						A[x][y] = A[now[0]][now[1]] + 1; // 깊이를 1 더해줌
						que.add(new int[] {x, y});
					}
				}
			}
		}
	}
	
}
