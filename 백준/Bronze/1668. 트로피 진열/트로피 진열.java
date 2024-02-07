import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] trophy = new int[N];
		int left = 1;
		int right = 1;
		for (int i = 0; i < N; i++) {
			trophy[i] = Integer.parseInt(br.readLine());
		}
		int max = trophy[0];
		for (int i = 1; i < N; i++) {
			if (trophy[i] > max) {
				left++;
				max = trophy[i];
			}
		}
		max = trophy[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			if (trophy[i] > max) {
				right++;
				max = trophy[i];
			}
		}
		System.out.printf("%d\n%d", left, right);
	}
}