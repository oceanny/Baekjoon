import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);

		int ans = num[0];
		while (true) {
			int count = 0;
			
			for (int i = 0; i < 5; i++) {
				if (ans % num[i] == 0)
					count++;
			}

			if (count >= 3) {
				System.out.println(ans);
				return;
			}
			else
				ans++;
			
		}
	}
}