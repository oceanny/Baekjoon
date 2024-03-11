import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n != -1) {
			int[] arr = new int[n];
			int count = 0;
			int sum = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					arr[count] = i;
					sum += i;
					count++;
				}
			}
			if (sum == n) {
				StringBuilder sb = new StringBuilder();
				sb.append(n).append(" = ");
				for (int i = 0; i < count; i++) {
					if (i == count - 1) {
						sb.append(arr[i]);
					}
					else {
						sb.append(arr[i]).append(" + ");
					}
				}
				System.out.println(sb);
			}
			else {
				System.out.printf("%d is NOT perfect.\n", n);
			}
			n = Integer.parseInt(br.readLine());
		}
	}
}