import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i -= 3) {
			if (i > 1) {
				int temp = (str.charAt(i - 2) - '0') * 4 + (str.charAt(i - 1) - '0') * 2 + str.charAt(i) - '0';
				sb.append(temp);
			}
			else if (i == 1) {
				int temp = (str.charAt(i - 1) - '0') * 2 + str.charAt(i) - '0';
				sb.append(temp);
			}
			else {
				int temp = str.charAt(i) - '0';
				sb.append(temp);
			}
		}
		
		System.out.println(sb.reverse());
	}
}