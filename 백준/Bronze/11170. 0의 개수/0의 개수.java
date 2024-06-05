import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int count = 0;
			for (int j = N; j <= M; j++) {
				int temp = j;
				if (temp == 0)
					count++;
				while (temp > 9) {
					if (temp % 10 == 0)
						count++;
					temp /= 10;
				}
			}
			
			System.out.println(count);
		}
	}
}