import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int val = 0;
		for (int i = 0; i < m; i++) {
			val += Integer.parseInt(st.nextToken()) * Math.pow(A, m - i - 1);
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		while (val > 0) {
			stack.push(val % B);
			val /= B;
		}
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		
		System.out.println(sb);
	}
}