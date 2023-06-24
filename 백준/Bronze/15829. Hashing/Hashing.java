import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		String s = br.readLine();
		long ans = 0;
		long multi = 1;
		for(int i = 0; i < l; i++) {
			ans += ((s.charAt(i) - 96) * multi);
			multi = (multi * 31) % 1234567891;
		}
		System.out.println(ans % 1234567891);
	}
}

