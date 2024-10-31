import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static char[][] candy;
	static int max = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		candy = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				candy[i][j] = s.charAt(j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				swap(i, j, i, j + 1);
				search();
				swap(i, j + 1, i, j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				swap(j, i, j + 1, i);
				search();
				swap(j + 1, i, j, i);
			}
		}
		
		System.out.println(max);
	}
	private static void search() {
		for (int i = 0; i < N; i++) {
			int count = 1;
			for (int j = 0; j < N - 1; j++) {
				if (candy[i][j] == candy[i][j + 1]) {
					count++;
					max = Math.max(max, count);
				}
				else count = 1;
			}
		}
		
		for (int i = 0; i < N; i++) {
			int count = 1;
			for (int j = 0; j < N - 1; j++) {
				if (candy[j][i] == candy[j + 1][i]) {
					count++;
					max = Math.max(max, count);
				}
				else count = 1;
			}
		}
		
	}
	private static void swap(int x1, int y1, int x2, int y2) {
		char temp = candy[x1][y1];
		candy[x1][y1] = candy[x2][y2];
		candy[x2][y2] = temp;		
	}
}