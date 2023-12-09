import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int team = 0;
		if (m >= n / 2) team = n / 2;
		else team = m;
		
		n -= 2 * team;
		m -= team;
		int left = n + m - k;
		
		if (left >= 0) System.out.println(team);
		else {
			left = Math.abs(left);
            int minus = (int)Math.ceil((double)left / 3);
            if (team - minus >= 0) {
                System.out.println(team - minus);
            } else {
                System.out.println("0");
            }
		}
	}
}