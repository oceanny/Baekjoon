import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < str.length(); j++) {
				if (j == n - 1) continue;
				sb.append(str.charAt(j));
			}
			System.out.println(sb);
		}
	}
}