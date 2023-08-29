import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		parent = new int[N + 1];
		// 인덱스 값 맞추기
		for (int i = 0; i < N + 1; i++) {
			parent[i] = i;
		}
		// 질의 계산
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int question = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// union
			if (question == 0) {
				union(a, b);
			}
			// checkSame
			else {
				boolean result = checkSame(a, b);
				if (result) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}

	private static void union(int a, int b) {
		// a와 b를 바로 비교하지 않고 대표 노드를 연결하기 위해 find 이용
		a = find(a);
		b = find(b);
		if (a != b) parent[b] = a;
	}

	private static int find(int a) {
		// 인덱스와 값이 같으면 대표 노드
		if (a == parent[a]) return a;
		// 같지 않으면 대표 노드를 찾음
		// 재귀를 벗어나며 경로 압축
		else return parent[a] = find(parent[a]);
	}
	
	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		if (a == b) return true;
		else return false;
	}
}
