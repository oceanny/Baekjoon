import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			br.readLine();
			int N = Integer.parseInt(br.readLine());
			BigInteger total = BigInteger.ZERO;
			for (int j = 0; j < N; j++) {
				BigInteger candy = new BigInteger(br.readLine());
				total = total.add(candy);
			}
			BigInteger num = new BigInteger("" + N);
			if (total.mod(num).compareTo(BigInteger.ZERO) == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}