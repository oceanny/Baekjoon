import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int n = Integer.parseInt(br.readLine());
		while(n != -1) {
			ans += n;
			n = Integer.parseInt(br.readLine());
		}
		System.out.print(ans);
	}
}