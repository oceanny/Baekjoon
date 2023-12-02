import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long K = Long.parseLong(st.nextToken());
		long N = Long.parseLong(st.nextToken());
		if (N == 1) {
			System.out.println("-1");
			return;
		}
		long X = (long) Math.ceil((double)(N * K / (N - 1)) + 1);
		if (N * K % (N - 1) == 0) X = N * K / (N - 1);
		System.out.println(X);
	}
}