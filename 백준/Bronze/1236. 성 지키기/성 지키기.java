import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] castle = new char[N][M];
		int row_count = 0;
		int col_count = 0;
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			castle[i] = line.toCharArray();
			if (!line.contains("X"))
				row_count++;
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (castle[j][i] == 'X' ) 
					break;
				if (j == N - 1)
					col_count++;
			}
		}
		
		System.out.println(Math.max(row_count, col_count));
	}
}