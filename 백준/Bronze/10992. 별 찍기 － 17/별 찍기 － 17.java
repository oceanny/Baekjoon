import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 1) {
			System.out.println("*");
			return;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.printf(" ");
			}
			if (i == N) {
				for (int j = 1; j < 2 * N; j++) {
					System.out.printf("*");
				}
				return;
			}
			else {
				System.out.printf("*");
			}
			if (i != 1) {
				for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
					System.out.printf(" ");
				}
				System.out.println("*");
			}
			else System.out.println();
		}
	}
}
