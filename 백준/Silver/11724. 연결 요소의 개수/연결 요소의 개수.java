import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static boolean[] visited; // 방문 배열
	static ArrayList<Integer>[] A; // 인접 리스트 배열
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int n = Integer.parseInt(st.nextToken()); // 정점의 개수
		int m = Integer.parseInt(st.nextToken()); // 간선의 개수
		visited = new boolean[n + 1];
		A = new ArrayList[n + 1];
        
		// 배열의 요소를 리스트로 선언
		for (int i = 1; i <= n; i++) {
			A[i] = new ArrayList<>();
		}
        
		// 인접 리스트에 인접 요소 저장
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			// 간선의 방향이 제시되어있지 않음
			// 따라서 양방향으로 설정
			A[u].add(v);
			A[v].add(u);
		}
		
		int count = 0;
		for (int v = 1; v <= n; v++) {
			if (!visited[v]) {
				count++;
				DFS(v);
			}
		}
		
		System.out.println(count);
	}
	
	private static void DFS(int v) {
		if (visited[v]) {
			return;
		}
		
		visited[v] = true;
		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
		
	}
}
