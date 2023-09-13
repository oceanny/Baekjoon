import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		int[] money = new int[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			// 오름차순 정렬
			Arrays.sort(arr);
			
			if (arr[0] == arr[1] && arr[1] == arr[2]) money[i] = 10000 + arr[0] * 1000;
			else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[0]) money[i] = arr[2] * 100;
			else money[i] = 1000 + arr[1] * 100;
			
			if (money[i] > max) max = money[i];
		}
		System.out.print(max);
	}
}