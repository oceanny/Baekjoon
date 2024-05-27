import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] line = new boolean[10002];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			for (int j = X; j < Y; j++) {
				line[j] = true;
			}
		}
		
		int sum = 0;
		boolean check = false;
		int start = 0;
		int end = 0;
		for (int i = 1; i <= 10001; i++) {
			if (line[i] != line[i - 1]) {
				check = !check;
				if (check) {
					start = i;
				}
				if (!check) {
					end = i;
					sum += end - start;
				}
			}
		}
		System.out.println(sum);
	}
}