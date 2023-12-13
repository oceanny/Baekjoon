import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			BigInteger K = new BigInteger(br.readLine());
			BigInteger two = new BigInteger("2");
			if (K.mod(two).equals(BigInteger.ZERO)) System.out.println("even");
			else System.out.println("odd");
		}
	}
}