import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String seat = br.readLine();
		boolean[] cup = new boolean[N + 1];
		int nope = 0;
		boolean couple = false;
		
		for (int i = 0; i < N; i++) {
			switch (seat.charAt(i)) {
			case 'S':
				if (!cup[i]) cup[i] = true;
				else if (!cup[i + 1]) cup[i + 1] = true;
				else nope++;
				break;
			case 'L':
				if (!couple) {
					couple = true;
					if (!cup[i]) cup[i] = true;
					else nope++;
				}
				else if (couple) {
					couple = false;
					if (!cup[i + 1]) cup[i + 1] = true;
					else nope++;
				}
				break;
			}
		}
		
		System.out.println(N - nope);
	}
}