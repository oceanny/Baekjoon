import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int count = 0;
		double sum = 0;
		for (int i = 0; i < S.length(); i++) {
			switch (S.charAt(i)) {
			case 'A': sum += 4.0; count++; break;
			case 'B': sum += 3.0; count++; break;
			case 'C': sum += 2.0; count++; break;
			case 'D': sum += 1.0; count++; break;
			case 'F': count++; break;
			case '+': sum += 0.5; break;
			}
		}
		System.out.println(sum / count);
	}
}