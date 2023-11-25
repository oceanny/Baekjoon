import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger P = new BigInteger(st.nextToken());
		BigInteger K = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger("1");
		while (true) {
			if (M.compareTo(K) >= 0 ) break;
			M = M.add(BigInteger.ONE);
			if (P.remainder(M).compareTo(BigInteger.ZERO) == 0 && M.compareTo(K) == -1) {
				System.out.println("BAD " + M);
				return;
			}
		}
		System.out.println("GOOD");
	}
}