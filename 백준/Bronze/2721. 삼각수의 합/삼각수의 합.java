import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(W(n));
		}
	}

	private static int W(int k) {
		int sum = 0;
		for (int i = 1; i <= k; i++) {
			sum += i * T(i + 1);
		}
		return sum;
	}

	private static int T(int k) {
		int sum = 0;
		for (int i = 1; i <= k; i++) {
			sum += i;
		}
		return sum;
	}
}
