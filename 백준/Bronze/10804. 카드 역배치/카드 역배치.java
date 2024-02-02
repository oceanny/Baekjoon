import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[21];
		for (int i = 1; i <= 20; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int num =  Math.abs(a - b) / 2;
			for (int j = 0; j <= num; j++) {
				int temp = arr[a + j];
				arr[a + j] = arr[b - j];
				arr[b - j] = temp;
			}
		}
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%d", arr[i]);
			if (i != 20) System.out.print(" ");
		}
	}
}