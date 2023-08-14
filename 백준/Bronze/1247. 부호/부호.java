import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger zero = new BigInteger("0");
		for (int i = 0; i < 3; i++) {
			int n = Integer.parseInt(br.readLine());
			BigInteger num = new BigInteger("0");
			for (int j = 0; j < n; j++) {
				BigInteger num2 = new BigInteger(br.readLine());
				num = num.add(num2);
			}
			if (num.compareTo(zero) >= 1) System.out.println("+");
			else if(num.compareTo(zero) <= -1) System.out.println("-");
			else System.out.println("0");
		}
	}
	
}
