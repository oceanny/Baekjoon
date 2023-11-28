import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			String name = br.readLine();
			if (name.contains("FBI")) {
				System.out.printf("%d ", i);
				count++;
			} 
		}
		if (count == 0) System.out.println("HE GOT AWAY!");
	}
}