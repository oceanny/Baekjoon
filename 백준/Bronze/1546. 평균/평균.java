import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int score = Integer.parseInt(st.nextToken());
			sum += score;
			max = Math.max(max, score);
		}
		
		System.out.println(sum * 100.0 / N / max);
	}
}