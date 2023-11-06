import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 15; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 15; j++) {
				if (check(st.nextToken())) return;
			}
		}
	}

	private static boolean check(String str) {
		if (str.equals("w")) {
			System.out.println("chunbae");
			return true;
		}
		if (str.equals("b")) {
			System.out.println("nabi");
			return true;
		}
		if (str.equals("g")) {
			System.out.println("yeongcheol");
			return true;
		}
		return false;
	}
}