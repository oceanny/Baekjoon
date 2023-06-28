import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt(); //테스트케이스 개수
		
		while(t-- > 0) {
			int n = sc.nextInt(); // 문서의 개수
			int m = sc.nextInt(); // 찾는 문서의 순서
			int count = 0;
			
			LinkedList<int[]> q = new LinkedList<>();
			
			for (int i = 0; i < n; i++) {
				q.offer(new int[] {i, sc.nextInt()});
			}
			
			while(!q.isEmpty()) {
				int[] front = q.poll();
				boolean isMax = true;
				
				for (int i = 0; i < q.size(); i++) {
					if (front[1] < q.get(i)[1]) {
						q.offer(front); // front 정의할 때 poll로 꺼냈으므로 따로 넣음
						for (int j = 0; j < i; j++) {
							q.offer(q.poll());							
						}
						isMax = false;
						break;
					}
				}
				
				if (isMax == false) continue;
				
				count++;
				if (front[0] == m) break;
			}
			sb.append(count).append('\n');
		}
		sc.close();
		System.out.println(sb);
	}
}
