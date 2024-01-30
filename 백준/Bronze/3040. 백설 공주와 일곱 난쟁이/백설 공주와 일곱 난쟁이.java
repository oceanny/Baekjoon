import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				int temp = num[i] + num[j];
				if (sum - temp == 100) {
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) continue;
						System.out.println(num[k]);
					}
				}
			}
		}
	}
}