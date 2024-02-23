import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (sum + temp < 100) sum += temp;
			else {
				if (sum + temp - 100 > 100 - sum) break;
				else if (sum + temp - 100 <= 100 - sum) {
					sum += temp;
					break;
				}
			}
		}
		System.out.println(sum);
	}
}