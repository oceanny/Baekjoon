import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] password = new String[N];
		String[] reverse = new String[N];
		for (int i = 0; i < N; i++) {
			password[i] = br.readLine();
			StringBuilder sb = new StringBuilder(password[i]);
			reverse[i] = sb.reverse().toString();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (password[i].equals(reverse[j])) {
					int len = password[i].length();
					System.out.printf("%d %c", len, password[i].charAt(len / 2));
					return;
				}
			}
		}
	}
}