import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tempA = st.nextToken();
		String tempB = st.nextToken();
		BigInteger A = new BigInteger(tempA, 2);
		BigInteger B = new BigInteger(tempB, 2);
		BigInteger sum = A.add(B);
		System.out.println(sum.toString(2));
	}
}