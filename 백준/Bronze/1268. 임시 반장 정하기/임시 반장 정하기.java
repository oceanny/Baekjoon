import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] ban = new int[N + 1][6];
		boolean[][] check = new boolean[N + 1][N + 1];
		int[] count = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 5; j++) {
				ban[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= 5; j++) {
				for (int k = 1; k <= N; k++) {
					if (i == k) continue;
					if (ban[i][j] == ban[k][j]) {
						check[i][k] = true;
					}
				}
			}
		}
		
		int max = 0;
		int index = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (check[i][j]) count[i]++;
			}
			if (count[i] > max) {
				max = count[i];
				index = i;
			}
			if (count[i] == max) {
				index = Math.min(index, i);
			}
		}
		System.out.println(index);
	}
}