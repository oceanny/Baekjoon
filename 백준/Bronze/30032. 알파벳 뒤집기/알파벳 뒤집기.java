import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				if (D == 1) sb.append(reverse1(str.charAt(j)));
				if (D == 2) sb.append(reverse2(str.charAt(j)));
			}
			System.out.println(sb);
		}
	}

	private static char reverse2(char ch) {
		switch (ch) {
		case 'd': return 'b';
		case 'b': return 'd';
		case 'q': return 'p';
		default: return 'q';
		}
	}

	private static char reverse1(char ch) {
		switch (ch) {
		case 'd': return 'q';
		case 'b': return 'p';
		case 'q': return 'd';
		default: return 'b';
		}
	}
}