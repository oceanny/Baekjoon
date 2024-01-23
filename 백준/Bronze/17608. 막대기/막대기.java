import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] height = new int[N];
		for (int i = 0; i < N; i++) {
			height[i] = Integer.parseInt(br.readLine());
		}
		int max = height[N - 1];
		int count = 1;
		for (int i = N - 2; i >= 0; i--) {
			if (height[i] > max) {
				max = height[i];
				count++;
			}
		}
		System.out.println(count);
	}
}