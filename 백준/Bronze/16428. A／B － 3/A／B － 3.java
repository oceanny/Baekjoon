import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		if (A.compareTo(BigInteger.ZERO) >= 0 && B.compareTo(BigInteger.ZERO) >= 0) { // +, +
			System.out.println(A.divide(B));
			System.out.println(A.mod(B));
		}
		else if (A.compareTo(BigInteger.ZERO) >= 0) { // +, -
			System.out.println(A.divide(B.negate()).negate());
			System.out.println(A.mod(B.negate()));
		}
		else if (B.compareTo(BigInteger.ZERO) >= 0) { // -, +
			System.out.println(A.divide(B).subtract(BigInteger.ONE));
			System.out.println(A.mod(B));
		}
		else { // -, -
			System.out.println(A.divide(B.negate()).subtract(BigInteger.ONE).negate());
			System.out.println(A.mod(B.negate()));
		}
	}
}
