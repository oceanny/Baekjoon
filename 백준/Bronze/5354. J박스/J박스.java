import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n) {
					for (int k = 1; k <= n; k++) {
						System.out.print("#");
					}
					System.out.println();
					continue;
				}
				for (int k = 1; k <= n; k++) {
					if (k == 1 || k == n) System.out.print("#");
					else System.out.print("J");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
