import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] triNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		triNum = new int[45];
		
		for (int i = 0; i < 45; i++) {
			triNum[i] = i * (i + 1) / 2;
		}
		
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int result = Eureka(K);
			System.out.println(result);
		}
	}

	private static int Eureka(int num) {
		for (int i = 1; i < 45; i++) {
			for (int j = 1; j < 45; j++) {
				for (int k = 1; k < 45; k++) {
					int check = triNum[i] + triNum[j] + triNum[k];
					if (check == num)
						return 1;
				}
			}
		}
		return 0;
	}
}