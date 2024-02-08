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
		String ans = "";
		if (A.compareTo(B) > 0) {
			String temp = A.toString();
			A = B;
			B = new BigInteger(temp);
		}
		if (B.subtract(A).mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
			ans = B.add(A).multiply((B.subtract(A)).divide(BigInteger.TWO)).add((B.add(A)).divide(BigInteger.TWO)).toString();
		}
		else {
			ans = B.add(A).multiply((B.subtract(A).add(BigInteger.ONE)).divide(BigInteger.TWO)).toString();
		}
		System.out.println(ans);
	}
}