import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] ch = new char[l];
		long ans = 0;
		long multi = 1;
		
		for (int i = 0; i < l; i++) {
			ch[i] = str.charAt(i);
			ans += (ch[i] - 96) * multi;
			multi *= 31 % 1234567891;
		}
		ans = ans % 1234567891;
		System.out.println(ans);

	}
}
