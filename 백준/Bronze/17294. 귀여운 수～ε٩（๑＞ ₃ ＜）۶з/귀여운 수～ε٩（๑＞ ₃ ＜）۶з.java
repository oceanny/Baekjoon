import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();

		int[] num = new int[N.length()];

		for (int i = 0; i < N.length(); i++) {
			num[i] = N.charAt(i);
		}
		try {
			int diff = num[0] - num[1];
			for (int i = 1; i < N.length() - 1; i++) {
				if (num[i] - num[i + 1] != diff) {
					System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
					return;
				}
			}
		} catch (Exception e) {
		}

		System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
	}
}