import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int[] arr = new int[97];
		arr[0] = N;
		for (int i = 1; i < 97; i++) {
			arr[i] = arr[i - 1] * N % P;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(i - j);
					return;
				}
			}
		}
    }
}