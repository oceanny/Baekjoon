import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long sum = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("0");
		
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) > 58) {
				sum += Long.parseLong(sb.toString());
				sb.setLength(0);
				sb.append("0");
			}
			else {
				sb.append(str.charAt(i) - '0');
			}
		}
		sum += Long.parseLong(sb.toString());
		
		System.out.println(sum);
	}
}