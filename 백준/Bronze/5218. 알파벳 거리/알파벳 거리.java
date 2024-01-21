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
			String x = st.nextToken();
			String y = st.nextToken();
			StringBuilder sb = new StringBuilder();
			sb.append("Distances: ");
			for (int j = 0; j < x.length(); j++) {
				if (y.charAt(j) < x.charAt(j)) sb.append(y.charAt(j) + 26 - x.charAt(j)).append(" ");
				else sb.append(y.charAt(j) - x.charAt(j)).append(" ");
			}
			System.out.println(sb);
		}
	}
}