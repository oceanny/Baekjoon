import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int nowh = Integer.parseInt(st.nextToken());
		int nowm = Integer.parseInt(st.nextToken());
		int nows = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ":");
		
		int thh = Integer.parseInt(st.nextToken());
		int thm = Integer.parseInt(st.nextToken());
		int ths = Integer.parseInt(st.nextToken());
		
		int now = nowh * 3600 + nowm * 60 + nows;
		int th = thh * 3600 + thm * 60 + ths;
		int ans = 0;
		
		if (th > now) ans = th - now;
		else if (th == now) ans = 86400;
		else {
			th += 86400;
			ans = th - now;
		}
		
		System.out.printf("%02d:%02d:%02d", ans / 3600, ans % 3600 / 60, ans % 60);
	}
}