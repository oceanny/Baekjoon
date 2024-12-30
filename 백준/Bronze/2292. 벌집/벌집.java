import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long num = 1;
		long idx = 1;
		
		while (num < N) {
			num += 6 * idx;
			idx++;
		}
		
		System.out.println(idx);
	}
}