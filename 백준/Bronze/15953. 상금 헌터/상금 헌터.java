import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(first(a) + second(b));
		}
	}
	
	private static int first(int a) {
		if (a == 0 || a > 21) return 0;
		if (a == 1) return 5000000;
		else if (a < 4) return 3000000;
		else if (a < 7) return 2000000;
		else if (a < 11) return 500000;
		else if (a < 16) return 300000;
		else return 100000;
	}

	private static int second(int b) {
		if (b == 0 || b > 31) return 0;
		if (b == 1) return 5120000;
		else if (b < 4) return 2560000;
		else if (b < 8) return 1280000;
		else if (b < 16) return 640000;
		else return 320000;
	}
}
