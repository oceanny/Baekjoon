import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long ans = 0;
		if (N <= 28) {
			int sum = 0;
			for (int i = 1; i <= 8; i++) {
				sum += i;
				if (N <= sum) {
					ans = i;
					break;
				}
			}
		}
		else {
			ans = (N - 29) / 7 + 8;
		}
		System.out.println(ans);
	}
}