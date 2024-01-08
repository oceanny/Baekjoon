import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		if (N.equals("0")) {
			System.out.println(N);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		String[] oct = {"000","001","010","011","100","101","110","111"};
		for (int i = 0; i < N.length(); i++) {
			sb.append(oct[N.charAt(i) - '0']);
		}
		
		while (sb.charAt(0) == '0') sb.deleteCharAt(0);
		System.out.println(sb);
	}
}