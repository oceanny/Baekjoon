import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int participant = 0;
		int max = 0;
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int score = 0;
			for (int j = 0; j < 4; j++) {
				score += Integer.parseInt(st.nextToken());
			}
			if (score > max) {
				participant = i + 1;
				max = score;
			}
		}
		System.out.printf("%d %d", participant, max);
	}
}