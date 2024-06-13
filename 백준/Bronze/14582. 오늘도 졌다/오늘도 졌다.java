import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] j = new int[9];
		int[] g = new int[9];
		
		j[0] = Integer.parseInt(st.nextToken());
		if (j[0] > 0) {
			System.out.println("Yes");
			return;
		}
		
		for (int i = 1; i < 9; i++) {
			j[i] = Integer.parseInt(st.nextToken()) + j[i - 1];
		}
		
		st = new StringTokenizer(br.readLine());
		g[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < 9; i++) {
			if (j[i] > g[i - 1]) {
				System.out.println("Yes");
				return;
			}
			g[i] = Integer.parseInt(st.nextToken()) + g[i - 1];
		}
		
		System.out.println("No");
	}
}