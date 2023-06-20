import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static String solution(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(' || c == '[') {
				st.push(c);
			}

			else if (c == ')') {
				if (st.empty() || st.peek() != '(') {
					return "no";
				} else
					st.pop();
			}

			else if (c == ']') {
				if (st.empty() || st.peek() != '[') {
					return "no";
				} else
					st.pop();
			}
		}

		if (st.empty())
			return "yes";
		else
			return "no";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			if (str.equals("."))
				break;
			System.out.println(solution(str));
		}
		sc.close();
	}
}