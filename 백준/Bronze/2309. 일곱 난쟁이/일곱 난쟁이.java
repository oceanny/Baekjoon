import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] height = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			height[i] = Integer.parseInt(br.readLine());
			sum += height[i];
		}
		a : for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				int temp = height[i] + height[j];
				if (sum - temp == 100) {
					height[i] = 0;
					height[j] = 0;
					break a;
				}
			}
		}
		Arrays.sort(height);
		for (int i = 2; i < 9; i++) {
			System.out.println(height[i]);
		}
	}
}