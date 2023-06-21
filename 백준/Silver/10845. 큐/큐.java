import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		String ans = "";
		int n = sc.nextInt();
		int num = 0;
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			switch (temp) {
			case "push":
				num = sc.nextInt();
				q.add(num);
				break;
			case "pop":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else {
					sb.append(q.peek() + "\n");
					q.poll();
				}
				break;
			case "size":
				sb.append(q.size() + "\n");
				break;
			case "empty":
				if (q.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
				break;
			case "front":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(q.peek() + "\n");
				break;
			case "back":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(num + "\n");
				break;
			}
		}
		ans = sb.toString();
		System.out.println(ans);
	}
}
