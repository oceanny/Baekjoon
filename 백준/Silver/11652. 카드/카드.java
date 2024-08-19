import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		int[] count = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
        
		count[0] = 1;
		int max = 1;
		long index = arr[0];
		for (int i = 1; i < N; i++) {
			count[i] = 1;
			if (arr[i] == arr[i - 1]) count[i] = count[i - 1] + 1;
			if (count[i] > max) {
				max = count[i];
				index = arr[i];
			}
		}
        
		System.out.println(index);
	}
}