import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Edge> graph;
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		graph = new ArrayList<>();
		parent = new int[N + 1];
		int ans = 0;
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			graph.add(new Edge(a, b, c));
		}
		
		Collections.sort(graph, new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return o1.cost - o2.cost;
			}
		});
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < graph.size(); i++) {
			Edge edge = graph.get(i);
			
			if (find(edge.start) != find(edge.end)) {
				ans += edge.cost;
				union(edge.start, edge.end);
			}
		}
		
		System.out.println(ans);
	}
	
	private static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if (x != y) parent[y] = x;
	}

	private static int find(int x) {
		if (x == parent[x]) return x;
		return parent[x] = find(parent[x]);
	}

	public static class Edge {
		public int start; 
		public int end; 
		public int cost;
		
		public Edge(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}
	}
}