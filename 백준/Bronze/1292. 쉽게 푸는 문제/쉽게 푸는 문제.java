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
		int[] arr = new int[B + 1];
		int count = 1;
		for (int i = 1; i <= 1000; i++) {
			int check = 1;
			while (check <= i) {
				if (count > B) break;
				arr[count] = i + arr[count - 1];
				count++;
				check++;
			}
		}
		System.out.println(arr[B] - arr[A - 1]);
	}
}