import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new ArrayDeque<>();
		String ans = "";
		int n = sc.nextInt();
		int num = 0;
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			switch (temp) {
			case "push_front":
				num = sc.nextInt();
				dq.addFirst(num);
				break;
			case "push_back":
				num = sc.nextInt();
				dq.addLast(num);
				break;
			case "pop_front":
				if (dq.isEmpty())
					sb.append(-1 + "\n");
				else {
					sb.append(dq.peekFirst() + "\n");
					dq.pollFirst();
				}
				break;
			case "pop_back":
				if (dq.isEmpty())
					sb.append(-1 + "\n");
				else {
					sb.append(dq.peekLast() + "\n");
					dq.pollLast();
				}
				break;
			case "size":
				sb.append(dq.size() + "\n");
				break;
			case "empty":
				if (dq.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
				break;
			case "front":
				if (dq.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(dq.peekFirst() + "\n");
				break;
			case "back":
				if (dq.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(dq.peekLast() + "\n");
				break;
			}
		}
		ans = sb.toString();
		System.out.println(ans);
	}
}
