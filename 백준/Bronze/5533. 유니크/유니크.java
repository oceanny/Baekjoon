import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] score = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < N; j++) {
				int standard = score[j][i];
				for (int k = j + 1; k < N; k++) {
					if (score[k][i] == 0) continue;
					if (score[k][i] == standard) {
						score[j][i] = 0;
						score[k][i] = 0;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(score[i][0] + score[i][1] + score[i][2]);
		}
	}
}