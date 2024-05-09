import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int check = 0;
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = N - 1; i > 0; i--) {
			int index = 0;
			
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[index]) {
					index = j;
				}
			}
			
			if (i != index) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				check++;
				
				if (check == K) {
					System.out.printf("%d %d", arr[index], arr[i]);
					return;
				}
			}
		}
		
		System.out.println("-1");
	}
}