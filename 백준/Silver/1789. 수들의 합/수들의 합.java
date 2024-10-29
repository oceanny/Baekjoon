import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		long check = 0;
		for (long i = 1; i <= Long.MAX_VALUE; i++) {
			if (check <= S) check += i;
			else {
				System.out.println(i - 2);
				break;
			}
		}
	}
}