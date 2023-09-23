import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] check = new int[101];
		int price = 0;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			for (int j = start; j < end; j++) {
				check[j]++;
			}
		}
		for (int i = 1; i <= 100; i++) {
			switch (check[i]) {
			case 1:price += check[i] * A; break;
			case 2:price += check[i] * B; break;
			case 3:price += check[i] * C; break;
			}
		}
		System.out.println(price);
	}

}