import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static ArrayList<Integer>[] A; // 인접 리스트 배열
	static int[] check; // 이분 그래프 확인 배열
	static boolean[] visited; // 방문 배열
	static boolean IsEven; // 정답 출력 변수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		// testCase만큼 반복
		for (int i = 0; i < testCase; i++) {
			String[] s = br.readLine().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			// 초기화
			A = new ArrayList[V + 1];
			check = new int[V + 1];
			visited = new boolean[V + 1];
			IsEven = true;
			
			for (int j = 1; j <= V; j++) {
				A[j] = new ArrayList<>();
			}
			// 에지 데이터 저장
			for (int j = 0; j < E; j++) {
				s = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				// 양방향
				A[start].add(end);
				A[end].add(start);
			}
			// 모든 노드에서 DFS 실행
			for (int j = 1; j <= V; j++) {
				if (IsEven) DFS(j);
				else break;
			}
			if (IsEven) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	private static void DFS(int node) {
		// 탐색했으므로 방문 배열 변경
		visited[node] = true;
		// node와 연결된 에지 모두 탐색
		for (int i : A[node]) {
			if (!visited[i]) {
				check[i] = (check[node] + 1) % 2;
				DFS(i);
			}
			else if (check[node] == check[i]) IsEven = false;
		}
	}
}
