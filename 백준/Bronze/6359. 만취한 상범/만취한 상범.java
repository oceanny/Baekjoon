import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			boolean[] room = new boolean[n + 1];
			for (int j = 1; j <= n; j++) {
				int number = 1;
				while (j * number <= n) {
					if (room[j * number]) room[j * number] = false;
					else room[j * number] = true;
					number++;
				}
			}
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (room[j]) count++;
			}
			System.out.println(count);
		}
	}
}