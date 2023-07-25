import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> que = new PriorityQueue<>((a, b)->{
			// 절댓값이 같은 경우 음수 우선
			if (Math.abs(a) == Math.abs(b)) {
				return a > b ? 1 : -1;
			}
			// 절댓값이 작은 데이터 우선		
			else return Math.abs(a) - Math.abs(b);
			
		});
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				if (que.isEmpty()) sb.append(0).append('\n');
				else sb.append(que.poll()).append('\n');
			}
			else que.add(temp);
		}
		
		System.out.println(sb);
	}
}
