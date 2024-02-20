import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] high = new int[N];
		int[] count = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			high[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (high[i] < high[j]) {
					count[i] = j - i - 1;
					break;
				}
				if (j == N - 1) {
					count[i] = j - i;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (count[i] > max) max = count[i];
		}
		System.out.println(max);
	}
}