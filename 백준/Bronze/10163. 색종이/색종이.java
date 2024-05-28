import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] square = new int[1001][1001];
		int[] area = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int j = x; j < x + a; j++) {
				for (int k = y; k < y + b; k++) {
					square[j][k] = i;
				}
			}
		}
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				if (square[i][j] != 0)
					area[square[i][j]]++;
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(area[i]);
		}
	}
}