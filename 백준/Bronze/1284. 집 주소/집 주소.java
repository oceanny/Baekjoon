import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		do {
			if (temp.equals("0")) return;
			int ans = temp.length() + 1;
			for (int i = 0; i < temp.length(); i++) {
				ans += calculator(temp.charAt(i) - '0');
			}
			System.out.println(ans);
			temp = br.readLine();
		} while (!temp.equals("0"));

	}

	private static int calculator(int i) {
		switch(i) {
		case 0:
			return 4;
		case 1:
			return 2;
		default:
			return 3;
		}
	}

}
