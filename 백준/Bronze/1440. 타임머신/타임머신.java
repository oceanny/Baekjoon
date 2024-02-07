import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int ans = 0;
		if ((a > 12 || a == 0) && (b > 12 || b == 0) && (c > 12 || c == 0))
		{
			System.out.println(ans);
			return;
		}
		if (a >= 60 || b >= 60 || c >= 60)
		{
			System.out.println(ans);
			return;
		}
		if (a >= 1 && a <= 12) ans += 2;
		if (b >= 1 && b <= 12) ans += 2;
		if (c >= 1 && c <= 12) ans += 2;
		System.out.println(ans);
	}
}