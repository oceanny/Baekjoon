import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int num = 0;
		long val = 0;
		
		for (int i = 0; i < N.length(); i++) {
			if (N.charAt(i) > '9') num = N.charAt(i) - 55;
			else num = N.charAt(i) - '0';
			
			val += num * Math.pow(B, N.length() - i - 1);
		}
		
		System.out.println(val);
	}
}