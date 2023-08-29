import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		// 인접 리스트 학생 수만큼 초기화
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		// 진입 차수 배열
		int indegree[] = new int[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			// A가 B보다 앞에 서야함 -> A가 B를 가리킴
			list.get(A).add(B);
			// 진입 차수 저장
			indegree[B]++;
		}
		// 위상 정렬 실행
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) que.offer(i);
		}
		while (!que.isEmpty()) {
			int now = que.poll();
			System.out.print(now + " ");
			for (int next : list.get(now)) {
				indegree[next]--;
				if (indegree[next] == 0) que.offer(next);
			}
		}
	}
}
