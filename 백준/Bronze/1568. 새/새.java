import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int ans = -1;
		while (N >= 0) {
			if (count > N) count = 1;
			N -= count;
			count++;
			ans++;
		}
		System.out.println(ans);
	}
}