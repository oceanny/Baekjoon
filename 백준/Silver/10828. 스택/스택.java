import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();
		String ans = "";
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			switch (temp) {
			case "push":
				st.push(sc.nextInt());
				break;
			case "pop":
				if (st.empty()) sb.append(-1 + "\n");
				else {
					sb.append(st.peek() + "\n");
					st.pop();
				}
				break;
			case "size":
				sb.append(st.size() + "\n");
				break;
			case "empty":
				if (st.empty()) sb.append(1 + "\n");
				else sb.append(0 + "\n");
				break;
			case "top":
				if (st.empty()) sb.append(-1 + "\n");
				else sb.append(st.peek() + "\n");
				break;
			}
		}
		ans = sb.toString();
		System.out.println(ans);
	}
}
