import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int index = -1;
		int ans = 0;
		
		for (int i = N; i >= 4; i--) {
			String check = Integer.toString(i);
			for (int j = 0; j < check.length(); j++) {
				if (check.charAt(j) == '4' || check.charAt(j) == '7')
					index = j;
				else {
					index = -1;
					break;
				}
			}
			if (index == check.length() - 1) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}
}