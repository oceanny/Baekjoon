import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			String[] str = br.readLine().split(" ");
			StringBuilder sb = new StringBuilder();
			for (int j = str.length - 1; j >= 0; j--) {
				sb.append(str[j]).append(" ");
			}
			System.out.printf("Case #%d: %s\n", i, sb.toString());
		}
	}
}