import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[N + 1];
		check[0] = check[1] = true;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= N; i++) {
			if (check[i]) continue;
			
			if (i >= M) sb.append(i).append("\n");
			
			for (int j = i + i; j <= N; j += i) {
				check[j] = true;
			}
		}
		
		System.out.println(sb);
	}
}