import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean continuity = false;
		int num = 1;
		int score = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp == 0) {
				num = 1;
				continuity = false;
			}
			else {
				if (continuity) {
					num += 1;
					score += num;
				}
				else {
					score += num;
				}
				continuity = true;
			}
		}
		System.out.print(score);
	}
}