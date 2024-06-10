import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		char[] number = N.toCharArray();
		for (int i = 1; i < N.length(); i++) {
			int first = 1;
			int second = 1;
			for (int j = 0; j < i; j++) {
				first *= number[j] - '0';
			}
			for (int j = i; j < N.length(); j++) {
				second *= number[j] - '0';
			}
			if (first == second) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}