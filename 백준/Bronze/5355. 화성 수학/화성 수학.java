import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			int count = 0;
			float number;
			while (true) {
				if (str.charAt(count) > 47 && str.charAt(count) < 58 || str.charAt(count) == '.') {
					sb.append(str.charAt(count));
					count++;
					continue;
				}
				number = Float.parseFloat(sb.toString());
				break;
			}
			for (int j = count; j < str.length(); j++) {
				switch (str.charAt(j)) {
				case '@': number *= 3.0; break;
				case '%': number += 5.0; break;
				case '#': number -= 7.0; break;
				}
			}
			System.out.printf("%.2f\n", number);
		}
	}
}