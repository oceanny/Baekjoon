import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int start = 0;

		while (N-- > 0) {
			int value = sc.nextInt();
			if (value > start) {
				for (int i = start + 1; i <= value; i++) {
					st.push(i);
					sb.append('+').append('\n');
				}
				start = value;
			}
			else if (st.peek() != value) {
				System.out.println("NO");
				return;
			}
			st.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}
}
