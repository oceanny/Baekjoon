import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] divisor = new int[n];
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				divisor[count] = i;
				count++;
			}
		}
		divisor[count] = n;
        count++;
		if (k > count) System.out.println("0");
		else System.out.println(divisor[k - 1]);
	}
}