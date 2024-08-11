import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	
	static int[][] arr;
	static boolean[] visited;
	
	static StringBuilder sb;
	static Queue<Integer> que;
	
	static int N;
	static int M;
	static int V;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		sb = new StringBuilder();
		que = new LinkedList<>();
		
		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		DFS(V);
		System.out.println(sb);
		
		sb  = new StringBuilder();
		visited = new boolean[N + 1];
		BFS(V);
		System.out.println(sb);
	}

	private static void DFS(int v) {
		visited[v] = true;
		sb.append(v).append(" ");
		
		for (int i = 1; i <= N; i++) {
			if (arr[v][i] == 0) continue;
			if (visited[i]) continue;
			
			DFS(i);
		}
	}
	
	private static void BFS(int v) {
		que.offer(v);
		visited[v] = true;
		sb.append(v).append(" ");
		
		while (!que.isEmpty()) {
			int q = que.poll();
			
			for (int i = 1; i <= N; i++) {
				if (arr[q][i] == 0) continue;
				if (visited[i]) continue;
				
				que.offer(i);
				visited[i] = true;
				sb.append(i).append(" ");
			}
		}
		
	}
}