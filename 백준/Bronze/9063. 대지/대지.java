import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max_x = -10000;
		int max_y = -10000;
		int min_x = 10000;
		int min_y = 10000;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (x > max_x) max_x = x;
			if (x < min_x) min_x = x;
			if (y > max_y) max_y = y;
			if (y < min_y) min_y = y;
		}
		System.out.println((max_x - min_x) * (max_y - min_y));
	}
}
