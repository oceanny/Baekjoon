import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			char[] alphabet = str.toCharArray();
			Arrays.sort(alphabet);
			int sum = 2015 - alphabet[0];
			for (int j = 1; j < alphabet.length; j++) {
				if (alphabet[j] != alphabet[j - 1]) sum -= alphabet[j];
			}
			System.out.println(sum);
		}
	}
}
