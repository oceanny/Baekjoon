import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] arr = br.readLine().split(" ");
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < arr.length; j++) {
				StringBuilder temp = new StringBuilder(arr[j]).reverse();
				sb.append(temp);
				if (j != arr.length - 1) sb.append(" ");
			}
			System.out.println(sb);
		}
	}
}