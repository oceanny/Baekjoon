import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(nums);
		
		int x = (int)Math.round(n * 0.15);
		for (int i = x; i < n - x; i++) {
			ans += nums[i];
		}
		ans = (int)Math.round((double)ans / (n - 2 * x));
		System.out.println(ans);
	}
}