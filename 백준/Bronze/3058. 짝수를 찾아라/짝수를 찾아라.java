import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] even = new int[7];
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if (temp % 2 == 0) {
					even[j] = temp;
					sum += temp;
				}
			}
			Arrays.sort(even);
			int count = 0;
			for (int j = 0; j < 7; j++) {
				if (even[j] != 0) {
					count = j;
					break;
				}
			}
			System.out.println(sum + " " + even[count]);
		}
	}
}