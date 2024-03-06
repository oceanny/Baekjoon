import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[11];
		boolean[] record = new boolean[11];
		boolean[] check = new boolean[11];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			boolean direction = Integer.parseInt(st.nextToken()) == 0 ? false : true;
			if (!record[cow]) {
				record[cow] = true;
				check[cow] = direction;
			}
			else if (check[cow] != direction) {
				count[cow]++;
				check[cow] = direction;
			}
		}
		int result = 0;
		for (int i = 1; i < 11; i++) {
			result += count[i];
		}
		System.out.println(result);
	}
}